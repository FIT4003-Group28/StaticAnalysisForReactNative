package defpackage;
/* compiled from: PG */
/* renamed from: aher  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aher implements ayqb {
    public final /* synthetic */ ahet a;
    private final /* synthetic */ int b;

    public /* synthetic */ aher(ahet ahetVar, int i) {
        this.b = i;
        this.a = ahetVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        boolean z = true;
        if (this.b == 0) {
            ahet ahetVar = this.a;
            if (((ahic) obj).a().a() != 3) {
                z = false;
            }
            ahetVar.g = z;
            return;
        }
        final ahet ahetVar2 = this.a;
        if (((ahhw) obj).c() != aika.ENDED || ahetVar2.g || ((aheu) ahetVar2.e.get()).b()) {
            return;
        }
        if (airu.b(((aheu) ahetVar2.e.get()).c(aiqk.c))) {
            aiqj aiqjVar = aiqj.AUTOPLAY;
            aijo a = aijp.a();
            a.a = (acvg) ahetVar2.b.get();
            final aiqk aiqkVar = new aiqk(aiqjVar, null, a.a());
            ahetVar2.a.execute(new Runnable() { // from class: ahes
                @Override // java.lang.Runnable
                public final void run() {
                    ahet ahetVar3 = ahet.this;
                    ((aheu) ahetVar3.e.get()).a(aiqkVar);
                }
            });
            return;
        }
        ahetVar2.h.a.c(new ahhk(true));
    }
}
