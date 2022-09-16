package defpackage;
/* compiled from: PG */
/* renamed from: lpq  reason: default package */
/* loaded from: classes3.dex */
public final class lpq extends akap implements ynl {
    private final yni a;

    public lpq(ajyi ajyiVar, yni yniVar, ajin ajinVar, ajin ajinVar2, auuf auufVar, avwm avwmVar, akam akamVar, ajrt ajrtVar) {
        super(ajyiVar, yniVar, auufVar, avwmVar, ajinVar, ajinVar2, akamVar);
        this.a = yniVar;
        auuf auufVar2 = this.c;
        if ((auufVar2.c & 32) == 0) {
            this.h.clear();
        } else {
            ajsm ajsmVar = this.h;
            aqtd aqtdVar = auufVar2.v;
            ajsmVar.add(new ajre(aqtdVar == null ? aqtd.a : aqtdVar));
            this.g.mG(new kxi(4));
        }
        if (ajrtVar != null) {
            this.d.mG(ajrtVar);
        }
        yniVar.h(this, lpq.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akap, defpackage.ajwl
    public final void d() {
        super.d();
        m(new lpp());
    }

    @Override // defpackage.ajwl, defpackage.ajwd, defpackage.zdx
    public final void j() {
        super.j();
        this.a.m(this);
    }

    @Override // defpackage.ajwl, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == lpq.class) {
            if (i == -1) {
                return new Class[]{gds.class};
            }
            if (i == 0) {
                String str = ((gds) obj).a;
                for (Object obj2 : this.m) {
                    if ((obj2 instanceof aqei) && str.equals(((aqei) obj2).c)) {
                        p(obj2);
                        return null;
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return aolu.q(this, obj, i);
    }
}
