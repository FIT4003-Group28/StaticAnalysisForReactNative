package defpackage;
/* compiled from: PG */
/* renamed from: aodf  reason: default package */
/* loaded from: classes.dex */
public enum aodf implements anyx {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);
    
    private final int f;

    aodf(int i) {
        this.f = i;
    }

    @Override // defpackage.anyx
    public final int a() {
        return this.f;
    }
}
