package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: cvsk  reason: default package */
/* loaded from: classes5.dex */
public final class cvsk implements cvsc {
    public final Context a;
    private final dbty<dbsg<Boolean>> b = cvsl.b(new dbty(this) { // from class: cvsh
        private final cvsk a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsk cvskVar = this.a;
            if (!dxxh.a.a().c()) {
                cvlw.a("BatteryStateImpl", "Charging unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            } else if (Build.VERSION.SDK_INT >= 23) {
                BatteryManager batteryManager = (BatteryManager) cvskVar.a.getSystemService("batterymanager");
                if (batteryManager == null) {
                    cvlw.a("BatteryStateImpl", "Charging unknown (SDK >= M, BatteryManager missing).", new Object[0]);
                    return dbpy.a;
                }
                cvlw.a("BatteryStateImpl", "Charging is %s (SDK >= M).", Boolean.valueOf(batteryManager.isCharging()));
                return dbsg.i(Boolean.valueOf(batteryManager.isCharging()));
            } else {
                Intent registerReceiver = cvskVar.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    cvlw.a("BatteryStateImpl", "Charging unknown (SDK < M, ACTION_BATTERY_CHANGED missing).", new Object[0]);
                    return dbpy.a;
                }
                int intExtra = registerReceiver.getIntExtra("plugged", -1);
                if (intExtra == -1) {
                    cvlw.a("BatteryStateImpl", "Charging unknown (SDK < M, plugged == -1).", new Object[0]);
                    return dbpy.a;
                }
                Boolean valueOf = Boolean.valueOf(intExtra != 0);
                cvlw.a("BatteryStateImpl", "Charging is %s (SDK < M, plugged == %s).", valueOf, Integer.valueOf(intExtra));
                return dbsg.i(valueOf);
            }
        }
    });
    private final dbty<dbsg<Float>> c = cvsl.b(new dbty(this) { // from class: cvsi
        private final cvsk a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsk cvskVar = this.a;
            if (!dxxh.a.a().d()) {
                cvlw.a("BatteryStateImpl", "Level unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            }
            BatteryManager batteryManager = (BatteryManager) cvskVar.a.getSystemService("batterymanager");
            if (batteryManager == null) {
                cvlw.a("BatteryStateImpl", "Level unknown (SDK >= L, BatteryManager missing).", new Object[0]);
                return dbpy.a;
            }
            int intProperty = batteryManager.getIntProperty(4);
            Float valueOf = Float.valueOf(intProperty / 100.0f);
            cvlw.a("BatteryStateImpl", "Level is %s (SDK >= L, batteryPropertyCapacity == %s).", valueOf, Integer.valueOf(intProperty));
            return dbsg.i(valueOf);
        }
    });
    private final dbty<dbsg<Boolean>> d = cvsl.b(new dbty(this) { // from class: cvsj
        private final cvsk a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsk cvskVar = this.a;
            if (!dxxh.a.a().j()) {
                cvlw.a("BatteryStateImpl", "Power saving unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            }
            PowerManager powerManager = (PowerManager) cvskVar.a.getSystemService("power");
            if (powerManager == null) {
                cvlw.a("BatteryStateImpl", "Power saving unknown (PowerManager missing).", new Object[0]);
                return dbpy.a;
            }
            Boolean valueOf = Boolean.valueOf(powerManager.isPowerSaveMode());
            cvlw.a("BatteryStateImpl", "Power saving is %s.", valueOf);
            return dbsg.i(valueOf);
        }
    });

    public cvsk(Context context) {
        this.a = context;
    }

    @Override // defpackage.cvsc
    public final dbsg<Boolean> a() {
        return this.b.a();
    }

    @Override // defpackage.cvsc
    public final dbsg<Float> b() {
        return this.c.a();
    }

    @Override // defpackage.cvsc
    public final dbsg<Boolean> c() {
        return this.d.a();
    }
}
