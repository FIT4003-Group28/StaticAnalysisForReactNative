package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: xfi  reason: default package */
/* loaded from: classes4.dex */
public final class xfi extends ajgv implements ynl {
    private final yni a;
    private final aoys b;
    private final Context c;
    private int d;

    public xfi(Context context, aoys aoysVar, aafo aafoVar, yni yniVar, ajgz ajgzVar, Object obj) {
        super(aafoVar, ajgzVar, obj, null);
        this.a = yniVar;
        yniVar.g(this);
        aoysVar.getClass();
        this.b = aoysVar;
        this.c = context;
        this.d = -1;
    }

    @Override // defpackage.ajgv
    protected final void a(int i) {
        this.d = i;
        this.i.getButton(-1).setEnabled(true);
    }

    @Override // defpackage.ajgv
    protected final void e() {
        aoys aoysVar = this.b;
        if ((aoysVar.b & 8) != 0) {
            aafo aafoVar = this.g;
            apzg apzgVar = aoysVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, d());
        }
    }

    @Override // defpackage.ajgv
    protected final void f() {
        aqxo.y(this.d != -1);
        aoyr aoyrVar = (aoyr) this.b.g.get(this.d);
        if ((aoyrVar.b & 2) != 0) {
            aafo aafoVar = this.g;
            apzg apzgVar = aoyrVar.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, d());
        }
        aoys aoysVar = this.b;
        if ((aoysVar.b & 32) != 0) {
            Context context = this.c;
            arag aragVar = aoysVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            zag.r(context, ajgl.b(aragVar), 1);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((xfh) obj).a() != 1) {
                    return null;
                }
                i(7);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{xfh.class};
    }

    @Override // defpackage.ajgv
    protected final void lu(int i) {
        aqxo.y(true);
        this.a.m(this);
    }
}
