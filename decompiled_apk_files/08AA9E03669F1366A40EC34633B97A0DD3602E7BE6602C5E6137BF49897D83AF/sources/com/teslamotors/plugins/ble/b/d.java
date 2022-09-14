package com.teslamotors.plugins.ble.b;

import com.google.android.gms.common.data.DataBufferSafeParcelable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageType.java */
/* loaded from: classes.dex */
public enum d {
    SetVin,
    SetAccountEmail,
    ScanForPeripherals,
    ClearPeripherals,
    ResetCommandPeripheral,
    AddToWhitelist,
    RemoveFromWhitelist,
    GetWhiteslistUpdate,
    GetStatus,
    GetPublicKeyInfo,
    StartMonitoringRSSI,
    StopMonitoringRSSI,
    SetConnectionBehaviorWhenUnauthorized,
    AuthResponse,
    UnlockCar,
    LockCar,
    OpenTrunk,
    OpenFrunk,
    OpenChargePort,
    CloseChargePort,
    ScanForPeripheralsResult,
    ClearPeripheralsResult,
    PublicKeyInfoResult,
    CommandResult,
    StatusMessage,
    LogMessage,
    SetEventSubscriptionsReady,
    Register,
    Unregister,
    RegisterComplete,
    PromoteServiceToForeground;
    
    private static final Map<Integer, d> F = new HashMap();

    public String b() {
        return DataBufferSafeParcelable.DATA_FIELD;
    }

    static {
        Iterator it = EnumSet.allOf(d.class).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            F.put(Integer.valueOf(dVar.ordinal()), dVar);
        }
    }

    public int a() {
        return ordinal();
    }

    public static d a(int i) {
        return F.get(Integer.valueOf(i));
    }

    public static String b(int i) {
        String format = String.format("Unknown - [%d]", Integer.valueOf(i));
        d a2 = a(i);
        return a2 != null ? a2.name() : format;
    }
}
