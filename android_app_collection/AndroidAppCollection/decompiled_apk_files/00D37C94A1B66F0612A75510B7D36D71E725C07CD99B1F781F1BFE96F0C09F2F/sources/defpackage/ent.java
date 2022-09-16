package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ent  reason: default package */
/* loaded from: classes3.dex */
public final class ent extends fdm implements airt, ynl {
    public final enw a;
    public final env b;
    public final enq c;
    public boolean d;
    public PlayerResponseModel e;
    private final yni f;
    private final airw g;
    private final aypf h;
    private final acti i;
    private final aacz j;

    public ent(feh fehVar, yni yniVar, airw airwVar, aacz aaczVar, enw enwVar, env envVar, enq enqVar, acti actiVar) {
        super(fehVar);
        this.f = yniVar;
        this.g = airwVar;
        this.j = aaczVar;
        this.h = new aypf();
        this.a = enwVar;
        this.b = envVar;
        this.c = enqVar;
        this.i = actiVar;
        this.d = false;
    }

    public final void a() {
        this.b.h();
    }

    public final void d(ahhm ahhmVar) {
        this.e = ahhmVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.apkk r12) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.e(apkk):boolean");
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().I().G(aypa.a()).aa(new ens(this), dzq.f), airwVar.al().aa(new ens(this, 1), dzq.f)};
    }

    public final void h() {
        this.e = null;
    }

    @Override // defpackage.feg
    public final void kF() {
        if (eog.aq(this.j)) {
            this.h.c();
        } else {
            this.f.m(this);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhk ahhkVar = (ahhk) obj;
                h();
                return null;
            } else if (i == 1) {
                d((ahhm) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhk.class, ahhm.class};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a6, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a7, code lost:
        r2 = r3.setNegativeButton(defpackage.ajgl.b(r2), new defpackage.enu(r0));
        r3 = r0.q.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
        r3 = defpackage.apok.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bc, code lost:
        if (r3 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01be, code lost:
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c0, code lost:
        if (r4 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c2, code lost:
        r4 = defpackage.apoj.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c8, code lost:
        if ((r4.b & 256) == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ca, code lost:
        r3 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cc, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ce, code lost:
        r3 = defpackage.apoj.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
        r3 = r3.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d2, code lost:
        if (r3 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d4, code lost:
        r3 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d6, code lost:
        r3 = defpackage.ajgl.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01db, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01dc, code lost:
        r0.p = r2.setPositiveButton(r3, (android.content.DialogInterface.OnClickListener) null).create();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e6, code lost:
        r0.p.show();
        r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f1, code lost:
        if (r0.o != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f3, code lost:
        r2 = new defpackage.enu(r0, 1);
        r3 = new android.app.AlertDialog.Builder(r0.b).setTitle(com.google.android.youtube.R.string.background_settings_is_on_title);
        r4 = r0.b;
        r0.o = r3.setMessage(r4.getString(com.google.android.youtube.R.string.background_settings_notification_message, new java.lang.Object[]{defpackage.eog.t(r0.g, r4)})).setNegativeButton(com.google.android.youtube.R.string.settings, r2).setNegativeButton(com.google.android.youtube.R.string.edit_settings_action, r2).setPositiveButton(com.google.android.youtube.R.string.ok, (android.content.DialogInterface.OnClickListener) null).create();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0238, code lost:
        r0.o.show();
        r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0241, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r2 < defpackage.env.a.toMillis()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r2 < r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r0.u.a() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        r2 = r0.s;
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r2 == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r3 == 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (r3 == 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r3 == 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r3 == 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r3 == 5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r0.j() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
        if (r0.i != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
        if (r0.k.g.size() != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
        r0.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if (r0.r.c(r0.k.g) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        r0.i();
        r0.r.a(r0.k.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
        r2 = r0.t.b().e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
        if (r2 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
        r2 = defpackage.asxj.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
        if (r2.ag == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
        if (r0.i != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
        r2 = defpackage.fvl.d();
        r3 = r0.m.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
        if (r3 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
        r3 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
        r2.k(defpackage.ajgl.b(r3));
        r2.i(-1);
        r0.d.i(r2.b());
        r0.n.u(new defpackage.acte(r0.m.f), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
        if (r0.j() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
        if (r0.i != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
        if (r0.j.m.size() != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
        r0.e.a(r0.j, r0.n, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
        if (r0.r.c(r0.j.m) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012a, code lost:
        r0.e.a(r0.j, r0.n, null, null);
        r0.r.a(r0.j.m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (r0.i != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
        r0.e.a(r0.l, r0.n, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0151, code lost:
        if (r0.j() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0159, code lost:
        if (r0.c.c() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015d, code lost:
        if (r0.q == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0161, code lost:
        if (r0.p != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0163, code lost:
        r3 = new android.app.AlertDialog.Builder(r0.b);
        r4 = r0.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016f, code lost:
        if ((r4.b & 1) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0171, code lost:
        r4 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0173, code lost:
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
        r4 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0179, code lost:
        r3 = r3.setTitle(defpackage.ajgl.b(r4));
        r4 = r0.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0186, code lost:
        if ((r4.b & 2) == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0188, code lost:
        r4 = r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018a, code lost:
        if (r4 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018c, code lost:
        r4 = defpackage.arag.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018f, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0190, code lost:
        r3 = r3.setMessage(defpackage.ajgl.b(r4));
        r4 = r0.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019d, code lost:
        if ((4 & r4.b) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019f, code lost:
        r2 = r4.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a1, code lost:
        if (r2 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a3, code lost:
        r2 = defpackage.arag.a;
     */
    @Override // defpackage.feg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nr() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ent.nr():void");
    }
}
