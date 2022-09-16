package defpackage;
/* compiled from: PG */
/* renamed from: adim  reason: default package */
/* loaded from: classes.dex */
public enum adim {
    MANUAL("manual"),
    DIAL("dial"),
    IN_APP_DIAL("in_app_dial"),
    CAST("cast");
    
    public final String e;

    adim(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
