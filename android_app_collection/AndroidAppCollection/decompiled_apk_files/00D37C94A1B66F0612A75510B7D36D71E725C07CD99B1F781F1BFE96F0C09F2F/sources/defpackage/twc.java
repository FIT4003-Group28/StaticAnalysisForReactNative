package defpackage;
/* compiled from: PG */
/* renamed from: twc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class twc implements anir {
    public final /* synthetic */ twg a;
    public final /* synthetic */ tvg b;
    private final /* synthetic */ int c;

    public /* synthetic */ twc(twg twgVar, tvg tvgVar) {
        this.a = twgVar;
        this.b = tvgVar;
    }

    public /* synthetic */ twc(twg twgVar, tvg tvgVar, int i) {
        this.c = i;
        this.a = twgVar;
        this.b = tvgVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            this.a.h(this.b);
            return anlz.p((Exception) obj);
        }
        this.a.h(this.b);
        return anlz.q((Boolean) obj);
    }
}
