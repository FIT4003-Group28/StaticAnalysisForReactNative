package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aios  reason: default package */
/* loaded from: classes.dex */
public class aios implements aimx, abea {
    private final Context a;
    protected ankt b = anlz.q(false);
    public boolean c;
    public aiop d;
    private final aijf e;
    private WeakReference f;

    public aios(Context context, aijf aijfVar) {
        this.a = context;
        this.e = aijfVar;
    }

    private final Boolean f() {
        if (!this.b.isDone()) {
            this.b = anlz.q(false);
            return false;
        }
        return (Boolean) ylx.h(this.b, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(asaa asaaVar, yiw yiwVar, String str) {
        aiot.a(yiwVar, h(asaaVar, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(asaa asaaVar, yiw yiwVar, String str) {
        aiop aiopVar = this.d;
        if (aiopVar == null) {
            aiot.a(yiwVar, h(asaaVar, str));
            return;
        }
        aiopVar.c = asaaVar.e;
        aiopVar.d = asaaVar.d;
        aiopVar.e = aijr.f(asaaVar);
        aioo aiooVar = new aioo(aiopVar, new aior(this, asaaVar, yiwVar, str), aiopVar.b, aiopVar.e);
        aiopVar.f = new AlertDialog.Builder(aiopVar.a).setTitle(aiopVar.c).setMessage(aiopVar.d).setPositiveButton(R.string.confirm, aiooVar).setNegativeButton(R.string.cancel, aiooVar).setOnCancelListener(aiooVar).show();
        l(aiopVar);
    }

    protected void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
    }

    public final aikd i(String str) {
        return new aikd(1, this.a.getString(R.string.unplayable_reason_unknown), str);
    }

    public final aiou j() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (aiou) weakReference.get();
        }
        return null;
    }

    public final void k(asaa asaaVar, yiw yiwVar, String str) {
        if (asaaVar == null) {
            aiot.a(yiwVar, i(str));
        } else if (aijr.i(asaaVar) || aijr.h(asaaVar)) {
            aijs g = this.e.g();
            if (aijr.g(asaaVar) || g != aijs.BACKGROUND) {
                yiwVar.b(null, aiot.a);
                d();
                return;
            }
            aiot.a(yiwVar, new aikd(13, this.a.getString(R.string.audio_unavailable), str));
        } else if (aijr.j(asaaVar)) {
            aiou j = j();
            if (j != null) {
                j.b();
            }
            c(asaaVar, yiwVar, str);
        } else {
            aiot.a(yiwVar, h(asaaVar, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(aiou aiouVar) {
        this.f = new WeakReference(aiouVar);
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        abedVar.E = f().booleanValue();
        abedVar.D = this.c;
    }

    @Override // defpackage.aimx
    public void rj(aina ainaVar) {
        final boolean booleanValue = f().booleanValue();
        ainaVar.u = booleanValue;
        ainaVar.t = this.c;
        ainaVar.t(new aimz() { // from class: aioq
            @Override // defpackage.aimz
            public final void a(afrt afrtVar) {
                aios aiosVar = aios.this;
                boolean z = booleanValue;
                afrtVar.d("allowControversialContent", aiosVar.c);
                afrtVar.d("allowAdultContent", z);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aikd h(defpackage.asaa r14, java.lang.String r15) {
        /*
            int r0 = r14.c
            int r0 = defpackage.awwc.cj(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = 1
        La:
            r2 = 2
            r3 = 0
            r4 = 3
            if (r0 != r2) goto L12
            r6 = 2
        L10:
            r7 = 0
            goto L32
        L12:
            if (r0 == r4) goto L30
            r5 = 7
            if (r0 != r5) goto L18
            goto L30
        L18:
            boolean r0 = defpackage.aijr.j(r14)
            if (r0 == 0) goto L2e
            int r0 = r14.c
            int r0 = defpackage.awwc.cj(r0)
            r3 = 5
            if (r0 != 0) goto L28
            goto L2b
        L28:
            if (r0 != r3) goto L2b
            r3 = 6
        L2b:
            r6 = r3
            r7 = 1
            goto L32
        L2e:
            r6 = 1
            goto L10
        L30:
            r6 = 3
            goto L10
        L32:
            aikd r0 = new aikd
            arzy r3 = r14.f
            if (r3 != 0) goto L3a
            arzy r3 = defpackage.arzy.a
        L3a:
            int r3 = r3.b
            r5 = 109608350(0x6887d9e, float:5.134209E-35)
            if (r3 != r5) goto L5a
            arzy r3 = r14.f
            if (r3 != 0) goto L47
            arzy r3 = defpackage.arzy.a
        L47:
            int r8 = r3.b
            if (r8 != r5) goto L50
            java.lang.Object r3 = r3.c
            atxy r3 = (defpackage.atxy) r3
            goto L52
        L50:
            atxy r3 = defpackage.atxy.a
        L52:
            boolean r3 = r3.b
            if (r1 == r3) goto L58
            r8 = 3
            goto L5b
        L58:
            r8 = 2
            goto L5b
        L5a:
            r8 = 1
        L5b:
            java.lang.String r9 = r14.d
            arzz r1 = r14.g
            if (r1 != 0) goto L63
            arzz r1 = defpackage.arzz.a
        L63:
            int r1 = r1.b
            r2 = 58356580(0x37a7364, float:7.360086E-37)
            if (r1 != r2) goto L7c
            arzz r14 = r14.g
            if (r14 != 0) goto L70
            arzz r14 = defpackage.arzz.a
        L70:
            int r1 = r14.b
            if (r1 != r2) goto L79
            java.lang.Object r14 = r14.c
            auad r14 = (defpackage.auad) r14
            goto L7d
        L79:
            auad r14 = defpackage.auad.a
            goto L7d
        L7c:
            r14 = 0
        L7d:
            r13 = r14
            r10 = 0
            r12 = 0
            r5 = r0
            r11 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aios.h(asaa, java.lang.String):aikd");
    }
}
