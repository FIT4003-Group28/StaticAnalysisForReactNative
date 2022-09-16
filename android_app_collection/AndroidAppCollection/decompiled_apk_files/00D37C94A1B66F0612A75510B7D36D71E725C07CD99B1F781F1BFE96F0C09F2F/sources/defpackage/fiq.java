package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: fiq  reason: default package */
/* loaded from: classes3.dex */
public final class fiq extends cyr {
    @dfs(a = 13)
    axnm a;
    @dfs(a = 13)
    awmt b;
    @dfs(a = 13)
    awmt c;
    @dfs(a = 13)
    airw d;

    private fiq() {
        super("PlaybackButton");
    }

    public static fip a(cyv cyvVar) {
        fip fipVar = new fip();
        fip.c(fipVar, cyvVar, new fiq());
        return fipVar;
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new ImageView(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void P(final cyv cyvVar, Object obj) {
        final ImageView imageView = (ImageView) obj;
        airw airwVar = this.d;
        awmt awmtVar = this.c;
        awmt awmtVar2 = this.b;
        axnm axnmVar = this.a;
        airwVar.G().i.aa(new ayqb() { // from class: fis
            /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
            @Override // defpackage.ayqb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r8) {
                /*
                    r7 = this;
                    android.widget.ImageView r0 = r1
                    cyv r1 = r2
                    ahia r8 = (defpackage.ahia) r8
                    int r2 = r8.a()
                    r3 = 6
                    r4 = 5
                    r5 = 1
                    if (r2 == r4) goto L18
                    int r2 = r8.a()
                    if (r2 != r3) goto L16
                    goto L18
                L16:
                    r2 = 0
                    goto L19
                L18:
                    r2 = 1
                L19:
                    int r8 = r8.a()
                    r6 = 2
                    if (r8 == r6) goto L39
                    r6 = 3
                    if (r8 == r6) goto L32
                    if (r8 == r4) goto L39
                    if (r8 == r3) goto L39
                    r3 = 10
                    if (r8 == r3) goto L39
                    r8 = 2131232266(0x7f08060a, float:1.8080636E38)
                    r0.setImageResource(r8)
                    goto L3f
                L32:
                    r8 = 2131232260(0x7f080604, float:1.8080624E38)
                    r0.setImageResource(r8)
                    goto L3f
                L39:
                    r8 = 2131232258(0x7f080602, float:1.808062E38)
                    r0.setImageResource(r8)
                L3f:
                    android.content.Context r8 = r1.b
                    if (r2 == 0) goto L47
                    r1 = 2130970676(0x7f040834, float:1.7550069E38)
                    goto L4a
                L47:
                    r1 = 2130970674(0x7f040832, float:1.7550065E38)
                L4a:
                    int r8 = defpackage.zhn.d(r8, r1)
                    r0.setColorFilter(r8)
                    r8 = r2 ^ 1
                    r0.setClickable(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fis.a(java.lang.Object):void");
            }
        }, dzq.n);
        imageView.setOnClickListener(new fit(airwVar, awmtVar2, axnmVar, imageView, awmtVar, cyvVar));
    }

    @Override // defpackage.czb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        fiq fiqVar = (fiq) cyrVar;
        if (this.k == fiqVar.k) {
            return true;
        }
        axnm axnmVar = this.a;
        if (axnmVar == null ? fiqVar.a != null : !axnmVar.equals(fiqVar.a)) {
            return false;
        }
        awmt awmtVar = this.b;
        if (awmtVar == null ? fiqVar.b != null : !awmtVar.equals(fiqVar.b)) {
            return false;
        }
        awmt awmtVar2 = this.c;
        if (awmtVar2 == null ? fiqVar.c != null : !awmtVar2.equals(fiqVar.c)) {
            return false;
        }
        airw airwVar = this.d;
        return airwVar == null ? fiqVar.d == null : airwVar.equals(fiqVar.d);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
