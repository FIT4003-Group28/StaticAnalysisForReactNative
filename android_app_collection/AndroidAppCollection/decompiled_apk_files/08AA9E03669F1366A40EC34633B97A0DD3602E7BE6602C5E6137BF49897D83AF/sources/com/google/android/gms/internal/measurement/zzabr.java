package com.google.android.gms.internal.measurement;
/* JADX WARN: Init of enum zzbwb can be incorrect */
/* JADX WARN: Init of enum zzbwc can be incorrect */
/* JADX WARN: Init of enum zzbwd can be incorrect */
/* JADX WARN: Init of enum zzbwe can be incorrect */
/* loaded from: classes.dex */
public enum zzabr {
    DOUBLE(zzabw.DOUBLE, 1),
    FLOAT(zzabw.FLOAT, 5),
    INT64(zzabw.LONG, 0),
    UINT64(zzabw.LONG, 0),
    INT32(zzabw.INT, 0),
    FIXED64(zzabw.LONG, 1),
    FIXED32(zzabw.INT, 5),
    BOOL(zzabw.BOOLEAN, 0),
    STRING(r2, 2) { // from class: com.google.android.gms.internal.measurement.zzabs
    },
    GROUP(r2, 3) { // from class: com.google.android.gms.internal.measurement.zzabt
    },
    MESSAGE(r2, 2) { // from class: com.google.android.gms.internal.measurement.zzabu
    },
    BYTES(r2, 2) { // from class: com.google.android.gms.internal.measurement.zzabv
    },
    UINT32(zzabw.INT, 0),
    ENUM(zzabw.ENUM, 0),
    SFIXED32(zzabw.INT, 5),
    SFIXED64(zzabw.LONG, 1),
    SINT32(zzabw.INT, 0),
    SINT64(zzabw.LONG, 0);
    
    private final zzabw zzbwl;
    private final int zzbwm;

    static {
        final zzabw zzabwVar = zzabw.STRING;
        final zzabw zzabwVar2 = zzabw.MESSAGE;
        final zzabw zzabwVar3 = zzabw.MESSAGE;
        final zzabw zzabwVar4 = zzabw.BYTE_STRING;
    }

    zzabr(zzabw zzabwVar, int i) {
        this.zzbwl = zzabwVar;
        this.zzbwm = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* synthetic */ zzabr(zzabw zzabwVar, int i, zzabq zzabqVar) {
        this(zzabwVar, i);
    }

    public final zzabw zzve() {
        return this.zzbwl;
    }
}
