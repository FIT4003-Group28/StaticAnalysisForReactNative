package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ilh  reason: default package */
/* loaded from: classes3.dex */
public final class ilh implements wjb, akyv {
    public zxb A;
    AlertDialog B;
    public UploadFrontendIdMapHelper C;
    public final List D;
    public final akzg E;
    public final akyh F;
    public final albf G;
    public final akyc H;
    public final akzd I;

    /* renamed from: J  reason: collision with root package name */
    public final akze f215J;
    public long K;
    public boolean L;
    public boolean M;
    public ankt N;
    ankt O;
    ankt P;
    public List T;
    public boolean U;
    public boolean V;
    public final String W;
    public final boolean Y;
    public final UploadActivity a;
    public Boolean aa;
    public final aqxo ac;
    private final wia ad;
    private final SharedPreferences ae;
    private final afvn af;
    private final akdr ag;
    private final akys ah;
    private final azqb ai;
    public final ankw b;
    public final aafo c;
    public final asfs d;
    public final aadd e;
    public final zxn f;
    public final zsn g;
    public acti h;
    public final akvm i;
    public final fud j;
    public final fvf k;
    public boolean l;
    public wiy m;
    public boolean n;
    public long o;
    public long p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public ilf t;
    public final alhu u;
    public ViewAnimatorHelper v;
    public ScrollView w;
    public ImageView x;
    public ImageView y;
    public TextView z;
    public int ab = 1;
    final List Q = new ArrayList();
    public int R = 0;
    public boolean S = false;
    public avuk X = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
    public boolean Z = false;

    public ilh(UploadActivity uploadActivity, ankw ankwVar, aafo aafoVar, yrj yrjVar, asfs asfsVar, aadd aaddVar, wia wiaVar, aqxo aqxoVar, zsn zsnVar, akvm akvmVar, akzg akzgVar, akyh akyhVar, akys akysVar, albf albfVar, akyc akycVar, fud fudVar, fvf fvfVar, afvn afvnVar, akzd akzdVar, akze akzeVar, akdr akdrVar, azqb azqbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z;
        boolean z2 = true;
        this.a = uploadActivity;
        this.b = ankwVar;
        this.c = aafoVar;
        this.d = asfsVar;
        this.ad = wiaVar;
        this.e = aaddVar;
        this.ac = aqxoVar;
        this.g = zsnVar;
        this.i = akvmVar;
        this.E = akzgVar;
        this.F = akyhVar;
        this.ah = akysVar;
        this.G = albfVar;
        this.H = akycVar;
        this.j = fudVar;
        this.k = fvfVar;
        this.af = afvnVar;
        this.I = akzdVar;
        this.f215J = akzeVar;
        this.ag = akdrVar;
        this.ai = azqbVar;
        j();
        Intent intent = uploadActivity.getIntent();
        this.W = intent != null ? intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id") : null;
        SharedPreferences sharedPreferences = uploadActivity.getSharedPreferences("youtube", 0);
        this.ae = sharedPreferences;
        boolean z3 = sharedPreferences.getBoolean("enable_upload_video_editing", false) || asfsVar.n;
        this.q = z3;
        this.r = (sharedPreferences.getBoolean("enable_upload_filters", false) || asfsVar.p) && z3;
        if (!asfsVar.s) {
            uploadActivity.getApplicationContext();
            z = false;
        } else {
            z = true;
        }
        this.s = z;
        this.f = new zxn(uploadActivity, sharedPreferences, yrjVar, new ild(this));
        this.D = new ArrayList();
        avvf avvfVar = aaddVar.a().h;
        if (!(avvfVar == null ? avvf.a : avvfVar).v) {
            aqxoVar.K();
            z2 = false;
        }
        this.Y = z2;
        this.u = new alhu(uploadActivity);
    }

    private static void v(ankt anktVar) {
        if (anktVar == null || anktVar.isDone()) {
            return;
        }
        anktVar.cancel(true);
    }

    private final void w(final boolean z) {
        this.S = z;
        this.a.runOnUiThread(new Runnable() { // from class: ikx
            @Override // java.lang.Runnable
            public final void run() {
                ilh ilhVar = ilh.this;
                boolean z2 = z;
                iln ilnVar = ilhVar.a.aa;
                if (ilnVar != null) {
                    ilnVar.b(z2);
                }
            }
        });
    }

    @Override // defpackage.akyv
    public final void a(final String str) {
        this.a.runOnUiThread(new Runnable() { // from class: ikw
            @Override // java.lang.Runnable
            public final void run() {
                ilh ilhVar = ilh.this;
                String str2 = str;
                if (!ilhVar.V || ilhVar.a.isFinishing() || ilhVar.a.isDestroyed()) {
                    return;
                }
                if (ilhVar.C.f(str2)) {
                    ilhVar.C.b(str2, ilhVar.F);
                } else {
                    ilhVar.C.d(str2);
                }
                if (ilhVar.D.isEmpty()) {
                    return;
                }
                Iterator it = ilhVar.D.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((alfc) it.next()).e().equals(str2)) {
                            it.remove();
                            ilhVar.R++;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                ilhVar.m();
            }
        });
    }

    @Override // defpackage.akyv
    public final void b(String str) {
    }

    public final asjj c() {
        return aqvb.q(this.D, this.W);
    }

    public final void d() {
        this.a.x();
    }

    public final synchronized void e() {
        if (this.ab != 1) {
            s(7);
        }
    }

    public final void f() {
        if (this.D.isEmpty() || this.B != null || this.a.Y == null || !this.S) {
            return;
        }
        for (alfc alfcVar : this.D) {
            this.G.h(alfcVar.e(), avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_FINALIZE_UPLOAD, alfcVar.d());
        }
        w(false);
        zxb zxbVar = this.A;
        vqr br = zxbVar != null ? zxbVar.br() : null;
        if (br != null) {
            this.o = br.k() - br.m();
        } else {
            Uri a = akyc.a(this.a.getIntent());
            if (!a.equals(Uri.EMPTY)) {
                Long h = zxi.h(a);
                if (h != null) {
                    this.o = h.longValue();
                } else {
                    for (alfc alfcVar2 : this.D) {
                        alcp alcpVar = alfcVar2.n;
                        if (alcpVar != null && (alcpVar.b & 2) != 0) {
                            long j = alcpVar.d;
                            if (j > this.o) {
                                this.o = j;
                            }
                        }
                    }
                }
            }
        }
        if (!this.n || TimeUnit.MILLISECONDS.toSeconds(this.o) < this.p) {
            s(8);
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.o);
        wia wiaVar = this.ad;
        wiaVar.a.e(wiaVar.a(Optional.of(Float.valueOf((float) seconds)), 2), new ilc(this));
    }

    public final void g(int i, asjj asjjVar) {
        acte acteVar = new acte(acuo.b(i));
        ((acsx) this.h).D(acteVar);
        this.h.w(acteVar, asjjVar);
    }

    @Override // defpackage.wjb
    public final void h() {
        this.h.d(acuo.a(9729), null, aqvb.q(this.D, this.W));
        eo supportFragmentManager = this.a.getSupportFragmentManager();
        this.m = (wiy) supportFragmentManager.f("verificationFragmentTag");
        ex l = supportFragmentManager.l();
        l.m(this.m);
        l.a();
        supportFragmentManager.ab();
        this.v.b(R.id.shared_mde_view);
        w(true);
    }

    @Override // defpackage.wjb
    public final void i() {
        this.h.d(acuo.a(9729), null, aqvb.q(this.D, this.W));
        s(8);
    }

    public final void j() {
        this.ab = 1;
        this.M = false;
        this.B = null;
        v(this.N);
        v(this.O);
        v(this.P);
        for (ankt anktVar : this.Q) {
            v(anktVar);
        }
        this.Q.clear();
        w(false);
    }

    public final void k() {
        this.a.runOnUiThread(new Runnable() { // from class: ikv
            @Override // java.lang.Runnable
            public final void run() {
                ilh.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(ems emsVar, Context context, String str) {
        if (!this.V || emsVar.isDestroyed() || emsVar.isFinishing()) {
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(R.string.too_many_external_uploads_error_title).setMessage(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: ikp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ilh ilhVar = ilh.this;
                ilhVar.B = null;
                if (ilhVar.D.isEmpty()) {
                    ilhVar.d();
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).setCancelable(false).create();
        this.B = create;
        create.show();
    }

    public final void m() {
        ems emsVar = this.a;
        l(emsVar, emsVar, emsVar.getResources().getQuantityString(R.plurals.invalid_uploads_error_msg, this.R + this.D.size()));
    }

    public final void n() {
        new akdv(akdu.d(this.a), this.h, Arrays.asList(new PermissionDescriptor(0, actj.UPLOAD_VIDEO_APPROVE_STORAGE_BUTTON, actj.UPLOAD_VIDEO_DENY_STORAGE_BUTTON)), R.string.upload_external_permission_snackbar_description, 0, bhj.d, bhj.e, this.ag).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x04cf A[Catch: all -> 0x08b5, TryCatch #1 {, blocks: (B:4:0x0003, B:19:0x0022, B:21:0x002a, B:23:0x0030, B:24:0x004b, B:26:0x0051, B:28:0x0061, B:30:0x006e, B:31:0x0077, B:39:0x00a7, B:41:0x00b1, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00cf, B:49:0x00d7, B:51:0x00e1, B:54:0x00ea, B:56:0x0106, B:57:0x0109, B:61:0x0112, B:63:0x011b, B:65:0x011f, B:66:0x0121, B:68:0x0129, B:70:0x0139, B:72:0x013d, B:73:0x013f, B:75:0x0145, B:77:0x0149, B:78:0x014b, B:80:0x0153, B:82:0x0157, B:83:0x0159, B:84:0x015b, B:86:0x0163, B:88:0x018f, B:90:0x01ca, B:93:0x01d8, B:94:0x01e1, B:96:0x01e5, B:97:0x01e7, B:99:0x01ed, B:100:0x01ef, B:102:0x01f5, B:104:0x01f9, B:105:0x01fb, B:107:0x0203, B:109:0x0207, B:110:0x0209, B:111:0x020b, B:113:0x020f, B:114:0x0211, B:117:0x021a, B:120:0x0220, B:123:0x0228, B:125:0x0241, B:126:0x0252, B:128:0x025a, B:130:0x0266, B:132:0x0271, B:134:0x027d, B:135:0x027f, B:140:0x028a, B:141:0x028d, B:142:0x0290, B:143:0x0292, B:145:0x02a7, B:147:0x02ab, B:149:0x02af, B:151:0x02b3, B:153:0x02b7, B:155:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:164:0x034a, B:166:0x034f, B:165:0x034d, B:167:0x0357, B:169:0x037e, B:168:0x036d, B:170:0x0396, B:172:0x039f, B:173:0x03a4, B:175:0x03a8, B:176:0x03ad, B:178:0x03b1, B:179:0x03b6, B:181:0x03ba, B:182:0x03bf, B:184:0x03c3, B:185:0x03c8, B:187:0x03cc, B:188:0x03d1, B:190:0x03d5, B:191:0x03da, B:192:0x03fe, B:193:0x03ff, B:194:0x0406, B:121:0x0223, B:122:0x0226, B:33:0x0085, B:35:0x008b, B:38:0x009e, B:195:0x0407, B:196:0x0419, B:198:0x041f, B:199:0x0425, B:201:0x0438, B:203:0x043c, B:204:0x0448, B:206:0x0450, B:208:0x045a, B:212:0x046a, B:214:0x0470, B:216:0x047b, B:218:0x0487, B:220:0x0491, B:219:0x048c, B:211:0x0464, B:224:0x0497, B:225:0x04a0, B:227:0x04bb, B:232:0x04c5, B:234:0x04cf, B:238:0x04dc, B:240:0x04e2, B:242:0x04ea, B:244:0x04f0, B:245:0x0520, B:247:0x0526, B:248:0x0570, B:250:0x0576, B:293:0x06c2, B:251:0x058b, B:253:0x0593, B:255:0x059d, B:257:0x05a5, B:261:0x05bd, B:265:0x05da, B:264:0x05d6, B:260:0x05b9, B:266:0x05e9, B:268:0x05f1, B:270:0x05fa, B:277:0x0621, B:280:0x063c, B:281:0x0640, B:273:0x060f, B:275:0x0617, B:276:0x061c, B:282:0x0662, B:284:0x066a, B:286:0x0676, B:287:0x0686, B:289:0x0692, B:290:0x06a4, B:292:0x06b0, B:294:0x0713, B:296:0x071f, B:297:0x0732, B:299:0x0736, B:302:0x073d, B:304:0x0743, B:307:0x075f, B:309:0x0763, B:312:0x076c, B:315:0x079c, B:318:0x07a1, B:320:0x07a9, B:321:0x07b7, B:323:0x07bd, B:324:0x07d3, B:326:0x07e4, B:329:0x07e9, B:333:0x080a, B:336:0x0836, B:338:0x083a, B:345:0x0876, B:341:0x0844, B:344:0x086f, B:350:0x087d, B:352:0x088e, B:354:0x0896, B:357:0x08a0, B:359:0x08a4, B:363:0x08ae, B:367:0x08b4), top: B:377:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e2 A[Catch: all -> 0x08b5, TryCatch #1 {, blocks: (B:4:0x0003, B:19:0x0022, B:21:0x002a, B:23:0x0030, B:24:0x004b, B:26:0x0051, B:28:0x0061, B:30:0x006e, B:31:0x0077, B:39:0x00a7, B:41:0x00b1, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00cf, B:49:0x00d7, B:51:0x00e1, B:54:0x00ea, B:56:0x0106, B:57:0x0109, B:61:0x0112, B:63:0x011b, B:65:0x011f, B:66:0x0121, B:68:0x0129, B:70:0x0139, B:72:0x013d, B:73:0x013f, B:75:0x0145, B:77:0x0149, B:78:0x014b, B:80:0x0153, B:82:0x0157, B:83:0x0159, B:84:0x015b, B:86:0x0163, B:88:0x018f, B:90:0x01ca, B:93:0x01d8, B:94:0x01e1, B:96:0x01e5, B:97:0x01e7, B:99:0x01ed, B:100:0x01ef, B:102:0x01f5, B:104:0x01f9, B:105:0x01fb, B:107:0x0203, B:109:0x0207, B:110:0x0209, B:111:0x020b, B:113:0x020f, B:114:0x0211, B:117:0x021a, B:120:0x0220, B:123:0x0228, B:125:0x0241, B:126:0x0252, B:128:0x025a, B:130:0x0266, B:132:0x0271, B:134:0x027d, B:135:0x027f, B:140:0x028a, B:141:0x028d, B:142:0x0290, B:143:0x0292, B:145:0x02a7, B:147:0x02ab, B:149:0x02af, B:151:0x02b3, B:153:0x02b7, B:155:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:164:0x034a, B:166:0x034f, B:165:0x034d, B:167:0x0357, B:169:0x037e, B:168:0x036d, B:170:0x0396, B:172:0x039f, B:173:0x03a4, B:175:0x03a8, B:176:0x03ad, B:178:0x03b1, B:179:0x03b6, B:181:0x03ba, B:182:0x03bf, B:184:0x03c3, B:185:0x03c8, B:187:0x03cc, B:188:0x03d1, B:190:0x03d5, B:191:0x03da, B:192:0x03fe, B:193:0x03ff, B:194:0x0406, B:121:0x0223, B:122:0x0226, B:33:0x0085, B:35:0x008b, B:38:0x009e, B:195:0x0407, B:196:0x0419, B:198:0x041f, B:199:0x0425, B:201:0x0438, B:203:0x043c, B:204:0x0448, B:206:0x0450, B:208:0x045a, B:212:0x046a, B:214:0x0470, B:216:0x047b, B:218:0x0487, B:220:0x0491, B:219:0x048c, B:211:0x0464, B:224:0x0497, B:225:0x04a0, B:227:0x04bb, B:232:0x04c5, B:234:0x04cf, B:238:0x04dc, B:240:0x04e2, B:242:0x04ea, B:244:0x04f0, B:245:0x0520, B:247:0x0526, B:248:0x0570, B:250:0x0576, B:293:0x06c2, B:251:0x058b, B:253:0x0593, B:255:0x059d, B:257:0x05a5, B:261:0x05bd, B:265:0x05da, B:264:0x05d6, B:260:0x05b9, B:266:0x05e9, B:268:0x05f1, B:270:0x05fa, B:277:0x0621, B:280:0x063c, B:281:0x0640, B:273:0x060f, B:275:0x0617, B:276:0x061c, B:282:0x0662, B:284:0x066a, B:286:0x0676, B:287:0x0686, B:289:0x0692, B:290:0x06a4, B:292:0x06b0, B:294:0x0713, B:296:0x071f, B:297:0x0732, B:299:0x0736, B:302:0x073d, B:304:0x0743, B:307:0x075f, B:309:0x0763, B:312:0x076c, B:315:0x079c, B:318:0x07a1, B:320:0x07a9, B:321:0x07b7, B:323:0x07bd, B:324:0x07d3, B:326:0x07e4, B:329:0x07e9, B:333:0x080a, B:336:0x0836, B:338:0x083a, B:345:0x0876, B:341:0x0844, B:344:0x086f, B:350:0x087d, B:352:0x088e, B:354:0x0896, B:357:0x08a0, B:359:0x08a4, B:363:0x08ae, B:367:0x08b4), top: B:377:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x071f A[Catch: all -> 0x08b5, TryCatch #1 {, blocks: (B:4:0x0003, B:19:0x0022, B:21:0x002a, B:23:0x0030, B:24:0x004b, B:26:0x0051, B:28:0x0061, B:30:0x006e, B:31:0x0077, B:39:0x00a7, B:41:0x00b1, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00cf, B:49:0x00d7, B:51:0x00e1, B:54:0x00ea, B:56:0x0106, B:57:0x0109, B:61:0x0112, B:63:0x011b, B:65:0x011f, B:66:0x0121, B:68:0x0129, B:70:0x0139, B:72:0x013d, B:73:0x013f, B:75:0x0145, B:77:0x0149, B:78:0x014b, B:80:0x0153, B:82:0x0157, B:83:0x0159, B:84:0x015b, B:86:0x0163, B:88:0x018f, B:90:0x01ca, B:93:0x01d8, B:94:0x01e1, B:96:0x01e5, B:97:0x01e7, B:99:0x01ed, B:100:0x01ef, B:102:0x01f5, B:104:0x01f9, B:105:0x01fb, B:107:0x0203, B:109:0x0207, B:110:0x0209, B:111:0x020b, B:113:0x020f, B:114:0x0211, B:117:0x021a, B:120:0x0220, B:123:0x0228, B:125:0x0241, B:126:0x0252, B:128:0x025a, B:130:0x0266, B:132:0x0271, B:134:0x027d, B:135:0x027f, B:140:0x028a, B:141:0x028d, B:142:0x0290, B:143:0x0292, B:145:0x02a7, B:147:0x02ab, B:149:0x02af, B:151:0x02b3, B:153:0x02b7, B:155:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:164:0x034a, B:166:0x034f, B:165:0x034d, B:167:0x0357, B:169:0x037e, B:168:0x036d, B:170:0x0396, B:172:0x039f, B:173:0x03a4, B:175:0x03a8, B:176:0x03ad, B:178:0x03b1, B:179:0x03b6, B:181:0x03ba, B:182:0x03bf, B:184:0x03c3, B:185:0x03c8, B:187:0x03cc, B:188:0x03d1, B:190:0x03d5, B:191:0x03da, B:192:0x03fe, B:193:0x03ff, B:194:0x0406, B:121:0x0223, B:122:0x0226, B:33:0x0085, B:35:0x008b, B:38:0x009e, B:195:0x0407, B:196:0x0419, B:198:0x041f, B:199:0x0425, B:201:0x0438, B:203:0x043c, B:204:0x0448, B:206:0x0450, B:208:0x045a, B:212:0x046a, B:214:0x0470, B:216:0x047b, B:218:0x0487, B:220:0x0491, B:219:0x048c, B:211:0x0464, B:224:0x0497, B:225:0x04a0, B:227:0x04bb, B:232:0x04c5, B:234:0x04cf, B:238:0x04dc, B:240:0x04e2, B:242:0x04ea, B:244:0x04f0, B:245:0x0520, B:247:0x0526, B:248:0x0570, B:250:0x0576, B:293:0x06c2, B:251:0x058b, B:253:0x0593, B:255:0x059d, B:257:0x05a5, B:261:0x05bd, B:265:0x05da, B:264:0x05d6, B:260:0x05b9, B:266:0x05e9, B:268:0x05f1, B:270:0x05fa, B:277:0x0621, B:280:0x063c, B:281:0x0640, B:273:0x060f, B:275:0x0617, B:276:0x061c, B:282:0x0662, B:284:0x066a, B:286:0x0676, B:287:0x0686, B:289:0x0692, B:290:0x06a4, B:292:0x06b0, B:294:0x0713, B:296:0x071f, B:297:0x0732, B:299:0x0736, B:302:0x073d, B:304:0x0743, B:307:0x075f, B:309:0x0763, B:312:0x076c, B:315:0x079c, B:318:0x07a1, B:320:0x07a9, B:321:0x07b7, B:323:0x07bd, B:324:0x07d3, B:326:0x07e4, B:329:0x07e9, B:333:0x080a, B:336:0x0836, B:338:0x083a, B:345:0x0876, B:341:0x0844, B:344:0x086f, B:350:0x087d, B:352:0x088e, B:354:0x0896, B:357:0x08a0, B:359:0x08a4, B:363:0x08ae, B:367:0x08b4), top: B:377:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0736 A[Catch: all -> 0x08b5, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:19:0x0022, B:21:0x002a, B:23:0x0030, B:24:0x004b, B:26:0x0051, B:28:0x0061, B:30:0x006e, B:31:0x0077, B:39:0x00a7, B:41:0x00b1, B:42:0x00bd, B:44:0x00c3, B:45:0x00c9, B:47:0x00cf, B:49:0x00d7, B:51:0x00e1, B:54:0x00ea, B:56:0x0106, B:57:0x0109, B:61:0x0112, B:63:0x011b, B:65:0x011f, B:66:0x0121, B:68:0x0129, B:70:0x0139, B:72:0x013d, B:73:0x013f, B:75:0x0145, B:77:0x0149, B:78:0x014b, B:80:0x0153, B:82:0x0157, B:83:0x0159, B:84:0x015b, B:86:0x0163, B:88:0x018f, B:90:0x01ca, B:93:0x01d8, B:94:0x01e1, B:96:0x01e5, B:97:0x01e7, B:99:0x01ed, B:100:0x01ef, B:102:0x01f5, B:104:0x01f9, B:105:0x01fb, B:107:0x0203, B:109:0x0207, B:110:0x0209, B:111:0x020b, B:113:0x020f, B:114:0x0211, B:117:0x021a, B:120:0x0220, B:123:0x0228, B:125:0x0241, B:126:0x0252, B:128:0x025a, B:130:0x0266, B:132:0x0271, B:134:0x027d, B:135:0x027f, B:140:0x028a, B:141:0x028d, B:142:0x0290, B:143:0x0292, B:145:0x02a7, B:147:0x02ab, B:149:0x02af, B:151:0x02b3, B:153:0x02b7, B:155:0x02bb, B:158:0x02c1, B:160:0x0314, B:162:0x0336, B:164:0x034a, B:166:0x034f, B:165:0x034d, B:167:0x0357, B:169:0x037e, B:168:0x036d, B:170:0x0396, B:172:0x039f, B:173:0x03a4, B:175:0x03a8, B:176:0x03ad, B:178:0x03b1, B:179:0x03b6, B:181:0x03ba, B:182:0x03bf, B:184:0x03c3, B:185:0x03c8, B:187:0x03cc, B:188:0x03d1, B:190:0x03d5, B:191:0x03da, B:192:0x03fe, B:193:0x03ff, B:194:0x0406, B:121:0x0223, B:122:0x0226, B:33:0x0085, B:35:0x008b, B:38:0x009e, B:195:0x0407, B:196:0x0419, B:198:0x041f, B:199:0x0425, B:201:0x0438, B:203:0x043c, B:204:0x0448, B:206:0x0450, B:208:0x045a, B:212:0x046a, B:214:0x0470, B:216:0x047b, B:218:0x0487, B:220:0x0491, B:219:0x048c, B:211:0x0464, B:224:0x0497, B:225:0x04a0, B:227:0x04bb, B:232:0x04c5, B:234:0x04cf, B:238:0x04dc, B:240:0x04e2, B:242:0x04ea, B:244:0x04f0, B:245:0x0520, B:247:0x0526, B:248:0x0570, B:250:0x0576, B:293:0x06c2, B:251:0x058b, B:253:0x0593, B:255:0x059d, B:257:0x05a5, B:261:0x05bd, B:265:0x05da, B:264:0x05d6, B:260:0x05b9, B:266:0x05e9, B:268:0x05f1, B:270:0x05fa, B:277:0x0621, B:280:0x063c, B:281:0x0640, B:273:0x060f, B:275:0x0617, B:276:0x061c, B:282:0x0662, B:284:0x066a, B:286:0x0676, B:287:0x0686, B:289:0x0692, B:290:0x06a4, B:292:0x06b0, B:294:0x0713, B:296:0x071f, B:297:0x0732, B:299:0x0736, B:302:0x073d, B:304:0x0743, B:307:0x075f, B:309:0x0763, B:312:0x076c, B:315:0x079c, B:318:0x07a1, B:320:0x07a9, B:321:0x07b7, B:323:0x07bd, B:324:0x07d3, B:326:0x07e4, B:329:0x07e9, B:333:0x080a, B:336:0x0836, B:338:0x083a, B:345:0x0876, B:341:0x0844, B:344:0x086f, B:350:0x087d, B:352:0x088e, B:354:0x0896, B:357:0x08a0, B:359:0x08a4, B:363:0x08ae, B:367:0x08b4), top: B:377:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void o() {
        /*
            Method dump skipped, instructions count: 2235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilh.o():void");
    }

    public final boolean p() {
        return Build.VERSION.SDK_INT < 23 || !akdr.f(this.a, new PermissionDescriptor[]{new PermissionDescriptor(0, actj.UPLOAD_VIDEO_APPROVE_STORAGE_BUTTON, actj.UPLOAD_VIDEO_DENY_STORAGE_BUTTON)});
    }

    public final boolean q() {
        wiy wiyVar = this.m;
        return wiyVar != null && wiyVar.ap();
    }

    public final boolean r(alfc alfcVar) {
        if (!this.q) {
            return false;
        }
        double floor = Math.floor(Math.random() * 10.0d);
        try {
            zxb zxbVar = this.A;
            asjj p = aqvb.p(alfcVar.e(), alfcVar.i);
            zxbVar.aV = p;
            zwm zwmVar = zxbVar.aL;
            if (zwmVar != null && p != null) {
                zwmVar.a = p;
            }
            zxb zxbVar2 = this.A;
            Uri a = alfcVar.a();
            zxh zxhVar = zxbVar2.aI;
            if (zxhVar == null) {
                zxbVar2.aH = a;
            } else if (!zxbVar2.aG && !akzj.f(zxhVar.c, a)) {
                zxbVar2.bt(a, null, null);
            }
            return true;
        } catch (IOException e) {
            zep.d("Failed to read the video file", e);
            if (floor == 0.0d) {
                String valueOf = String.valueOf(zxq.d(e));
                afus.c(1, 6, valueOf.length() != 0 ? "youtubeUploadEditParse::".concat(valueOf) : new String("youtubeUploadEditParse::"), e);
            }
            return false;
        } catch (Error e2) {
            zep.d("Failed to parse the video file", e2);
            if (floor == 0.0d) {
                String valueOf2 = String.valueOf(zxq.d(e2));
                afus.c(1, 6, valueOf2.length() != 0 ? "youtubeUploadEditParse::".concat(valueOf2) : new String("youtubeUploadEditParse::"), e2);
            }
            return false;
        } catch (RuntimeException e3) {
            zep.d("Failed to start the edit mode", e3);
            if (floor == 0.0d) {
                String valueOf3 = String.valueOf(zxq.d(e3));
                afus.c(1, 6, valueOf3.length() != 0 ? "youtubeUploadEditParse::".concat(valueOf3) : new String("youtubeUploadEditParse::"), e3);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void s(int i) {
        int i2 = this.ab;
        if (i2 != i) {
            iqe.c(i2).length();
            iqe.c(i).length();
            this.ab = i;
        }
        k();
    }

    public final synchronized void t(ankt anktVar, int i, Throwable th) {
        boolean z = th instanceof CancellationException;
        if (!z) {
            this.f215J.c("Activity helper error", th, akyc.k(akyc.l(this.a.getIntent())));
        }
        if (anktVar != null && !anktVar.isCancelled() && !z) {
            s(i);
            return;
        }
        e();
    }

    @Override // defpackage.wjb
    public final void u() {
        this.h.d(acuo.a(9729), null, aqvb.q(this.D, this.W));
        s(8);
    }
}
