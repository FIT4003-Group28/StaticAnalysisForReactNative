package defpackage;
/* compiled from: PG */
/* renamed from: wxc  reason: default package */
/* loaded from: classes4.dex */
public final class wxc {
    private final wkl a;
    private Object b;

    public wxc(wkl wklVar) {
        wklVar.getClass();
        this.a = wklVar;
    }

    public final void a() {
        this.b = null;
    }

    public final void b(Object obj) {
        if (obj == null || obj != this.b) {
            return;
        }
        this.b = null;
    }

    public final void c(Object obj, apel apelVar) {
        if (obj != null) {
            if (apelVar != apel.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_ADS_DEBOUNCE && !this.a.e().contains(Integer.valueOf(apelVar.f))) {
                return;
            }
            this.b = obj;
        }
    }

    public final boolean d(Object obj) {
        return this.a.h() && obj != null && obj == this.b;
    }
}
