package net.frozenorb.qlib.autoreboot.listeners;

import net.frozenorb.qlib.event.HourEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/** Scheduled reboots are disabled; MicetPvP owns the idle-only restart policy. */
public class AutoRebootListener implements Listener {

    @EventHandler
    public void onHour(HourEvent event) {
        // Intentionally ignore AutoRebootTimes, including values in existing configs.
        // Manual reboot commands still use AutoRebootHandler directly.
    }

}
