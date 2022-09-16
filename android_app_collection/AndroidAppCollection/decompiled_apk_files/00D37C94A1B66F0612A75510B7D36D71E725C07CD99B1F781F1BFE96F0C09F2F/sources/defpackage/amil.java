package defpackage;
/* compiled from: PG */
/* renamed from: amil  reason: default package */
/* loaded from: classes.dex */
public enum amil {
    ON_CHARGER(1),
    ON_NETWORK_UNMETERED(2),
    ON_NETWORK_CONNECTED(4);
    
    public final int d;

    amil(int i) {
        this.d = i;
    }
}
