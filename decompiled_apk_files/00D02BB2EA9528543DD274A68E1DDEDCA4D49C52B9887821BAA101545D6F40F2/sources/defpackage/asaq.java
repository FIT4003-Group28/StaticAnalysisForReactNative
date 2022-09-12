package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asaq  reason: default package */
/* loaded from: classes2.dex */
public final class asaq implements crgx {
    private static final String b;
    private static final eaow c;
    private final cqat d;
    private final Context e;
    private final Executor f;
    private final btrm g;
    private final dxio<akfa> h;
    private final asas i;
    @dzsi
    private btlu k;
    @dzsi
    private cmva l;
    final asap a = new asap(this);
    private long j = 0;
    private final crzp<btlu> m = new asao(this);

    static {
        String canonicalName = asaq.class.getCanonicalName();
        dbsk.s(canonicalName);
        b = canonicalName;
        c = eaow.c(1L);
    }

    public asaq(cqat cqatVar, Context context, btrm btrmVar, Executor executor, dxio<akfa> dxioVar, asas asasVar) {
        this.d = cqatVar;
        this.e = context;
        this.f = executor;
        this.g = btrmVar;
        this.h = dxioVar;
        this.i = asasVar;
    }

    private final synchronized boolean f() {
        return this.d.b() - this.j > c.b;
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.crgx
    public final synchronized void a() {
        this.h.a().C().a(this.m, this.f);
        d(this.h.a().j());
        btrm btrmVar = this.g;
        asap asapVar = this.a;
        dceq a = dcet.a();
        a.b(crhp.class, new asar(crhp.class, asapVar));
        btrmVar.g(asapVar, a.a());
    }

    @Override // defpackage.crgx
    public final synchronized void b() {
        this.h.a().C().c(this.m);
        this.g.a(this.a);
        e(null, true);
        this.l = null;
    }

    public final synchronized void d(@dzsi btlu btluVar) {
        btlu btluVar2;
        if (this.l == null || !dbsd.a(this.k, btluVar)) {
            Account account = null;
            e(null, true);
            this.k = btluVar;
            if (btlu.i(btluVar) == btlt.GOOGLE && (btluVar2 = this.k) != null) {
                account = btluVar2.s();
            }
            this.j = 0L;
            this.l = cmuy.a(this.e, cmuz.a(b, account));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(2:164|165)|13|(15:(1:15)(2:91|(1:93)(38:94|(4:97|(2:99|100)(20:102|(1:104)|105|(1:(2:108|(2:110|(1:(1:(1:114)(1:115))(1:116)))(1:153))(1:154))(1:155)|117|(1:119)|120|(3:122|(1:124)|125)|126|(5:128|(1:130)|131|(1:133)|134)(1:152)|135|(3:137|(1:139)|140)|141|(1:143)|144|(1:146)|147|(1:149)|150|151)|101|95)|156|157|(1:159)|160|17|18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(1:32)|33|(1:35)|36|(1:38)|39|40|41|42|43|44|(1:46)|47|48|(1:50)(5:69|(1:71)|72|(1:74)|75)|51|(7:53|(1:55)|56|(1:58)|59|(1:61)|62)|63|(1:65)|66|67|68))|42|43|44|(0)|47|48|(0)(0)|51|(0)|63|(0)|66|67|68)|16|17|18|(0)|21|(0)|24|(0)|27|(0)|30|(0)|33|(0)|36|(0)|39|40|41) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023d A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269 A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0293 A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f5 A[Catch: IOException -> 0x0336, all -> 0x03ff, TryCatch #0 {IOException -> 0x0336, blocks: (B:111:0x02c5, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335), top: B:164:0x02c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341 A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0394 A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e4 A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212 A[Catch: all -> 0x03ff, TryCatch #3 {, blocks: (B:4:0x0005, B:9:0x000d, B:17:0x001c, B:19:0x0022, B:89:0x01f0, B:92:0x01f7, B:95:0x01fe, B:97:0x0212, B:98:0x0218, B:101:0x0239, B:103:0x023d, B:104:0x0243, B:106:0x0269, B:107:0x026f, B:109:0x0293, B:110:0x0298, B:111:0x02c5, B:112:0x02dc, B:113:0x02ec, B:115:0x02f5, B:116:0x02fb, B:118:0x030c, B:120:0x0314, B:121:0x031a, B:122:0x031b, B:124:0x031d, B:126:0x0325, B:127:0x032b, B:128:0x032c, B:129:0x0335, B:130:0x0336, B:140:0x038e, B:142:0x0394, B:144:0x0398, B:145:0x039e, B:147:0x03ac, B:148:0x03b2, B:150:0x03be, B:151:0x03c4, B:152:0x03c9, B:154:0x03e4, B:155:0x03eb, B:133:0x0341, B:135:0x0351, B:136:0x0357, B:138:0x0379, B:139:0x037f, B:22:0x0029, B:24:0x0051, B:26:0x0055, B:28:0x0058, B:84:0x01ba, B:31:0x0063, B:33:0x0089, B:34:0x008e, B:49:0x00be, B:51:0x00c2, B:52:0x00c8, B:54:0x00dc, B:56:0x00e6, B:57:0x00ec, B:58:0x00fb, B:60:0x0101, B:62:0x0114, B:63:0x011a, B:65:0x012e, B:66:0x0134, B:68:0x0147, B:70:0x014d, B:72:0x0156, B:73:0x015c, B:74:0x016b, B:76:0x0175, B:77:0x017b, B:79:0x019a, B:80:0x01a0, B:82:0x01af, B:83:0x01b5, B:85:0x01c3, B:87:0x01d0, B:88:0x01d6, B:13:0x0014), top: B:165:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(@defpackage.dzsi defpackage.crqf r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asaq.e(crqf, boolean):void");
    }
}
