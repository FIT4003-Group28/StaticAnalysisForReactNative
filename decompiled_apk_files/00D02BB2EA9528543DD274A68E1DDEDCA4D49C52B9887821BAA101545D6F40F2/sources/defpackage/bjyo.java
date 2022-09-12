package defpackage;
/* compiled from: PG */
/* renamed from: bjyo  reason: default package */
/* loaded from: classes3.dex */
public class bjyo implements bjwm {
    private final boolean a;
    private final String b;

    public bjyo(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.bjwm
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bjwm
    public String b() {
        return this.b;
    }
}
