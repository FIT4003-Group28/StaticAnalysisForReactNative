package defpackage;
/* compiled from: PG */
/* renamed from: ndk  reason: default package */
/* loaded from: classes3.dex */
public final class ndk implements ajws {
    private final /* synthetic */ int a;

    public ndk() {
    }

    public ndk(int i) {
        this.a = i;
    }

    @Override // defpackage.ajws
    public final Object a(Object obj) {
        Object mbfVar;
        if (this.a == 0) {
            return obj instanceof apqk ? new ndj((apqk) obj) : obj;
        }
        if (obj instanceof auhu) {
            mbfVar = new mbg((auhu) obj);
        } else if (!(obj instanceof auhq)) {
            return !(obj instanceof auix) ? obj : new mbh((auix) obj);
        } else {
            mbfVar = new mbf((auhq) obj);
        }
        return mbfVar;
    }
}
