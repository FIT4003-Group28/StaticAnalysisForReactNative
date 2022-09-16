package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import com.google.android.apps.youtube.app.application.Shell_MediaSearchActivity;
import com.google.android.apps.youtube.app.application.Shell_ResultsActivity;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.NavigateAndOpenDialogEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: oiw  reason: default package */
/* loaded from: classes3.dex */
public final class oiw implements ghv, ynl {
    private final kwa A;
    private final evm B;
    private final acvp C;
    private final yni D;
    private ankt E;
    private final aacz F;
    public final oa a;
    public final aafo b;
    public final ojl c;
    public final ind d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public Intent i;
    public Bundle j;
    public final ise k;
    private final ajgz l;
    private final afvn m;
    private final eza n;
    private final evn o;
    private final azqb p;
    private final acrr q;
    private final azqb r;
    private final ond s;
    private final eid t;
    private final emo u;
    private final oiy v;
    private final azqb w;
    private final Executor x;
    private final Set y = new CopyOnWriteArraySet();
    private final azqb z;

    public oiw(oa oaVar, aafo aafoVar, ajgz ajgzVar, afvn afvnVar, eza ezaVar, evn evnVar, azqb azqbVar, azqb azqbVar2, ond ondVar, eid eidVar, ojl ojlVar, emo emoVar, oiy oiyVar, azqb azqbVar3, Executor executor, aacz aaczVar, yni yniVar, azqb azqbVar4, kwa kwaVar, ind indVar, ise iseVar, acrr acrrVar, evm evmVar, acvp acvpVar, byte[] bArr) {
        this.a = oaVar;
        this.b = aafoVar;
        this.l = ajgzVar;
        this.m = afvnVar;
        this.n = ezaVar;
        this.o = evnVar;
        this.p = azqbVar;
        this.r = azqbVar2;
        this.s = ondVar;
        this.t = eidVar;
        this.c = ojlVar;
        this.u = emoVar;
        this.v = oiyVar;
        this.w = azqbVar3;
        this.x = executor;
        this.B = evmVar;
        this.C = acvpVar;
        this.F = aaczVar;
        this.z = azqbVar4;
        this.A = kwaVar;
        this.d = indVar;
        this.k = iseVar;
        this.q = acrrVar;
        this.D = yniVar;
        yniVar.g(this);
    }

    public static boolean i(Intent intent) {
        String stringExtra = intent.getStringExtra("source");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        return stringExtra.equals("shortcut");
    }

    private final ankt j(Intent intent, boolean z) {
        WatchDescriptor b;
        ahfe.k(this.a, (acti) this.z.get(), intent);
        ond ondVar = this.s;
        String action = intent.getAction();
        SettableFuture settableFuture = null;
        boolean z2 = true;
        if (TextUtils.isEmpty(action) || !action.startsWith("com.google.android.apps.wellbeing.VIEW_APP_USAGE")) {
            eid eidVar = this.t;
            String action2 = intent.getAction();
            if (TextUtils.isEmpty(action2) || !action2.startsWith("com.google.android.apps.wellbeing.action.VIEW_WIND_DOWN_STATE_CONFIGURATION_SETTINGS")) {
                int i = 3;
                if (intent.hasExtra("navigation_endpoint")) {
                    apzg b2 = aafr.b(intent.getExtras().getByteArray("navigation_endpoint"));
                    if (b2.qn(NavigateAndOpenDialogEndpointOuterClass.navigateAndOpenDialogEndpoint)) {
                        atnn atnnVar = (atnn) b2.qm(NavigateAndOpenDialogEndpointOuterClass.navigateAndOpenDialogEndpoint);
                        aafo aafoVar = this.b;
                        apzg apzgVar = atnnVar.b;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, null);
                        aafo aafoVar2 = this.b;
                        apzg apzgVar2 = atnnVar.c;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar2.c(apzgVar2, null);
                    } else {
                        this.b.c(b2, null);
                    }
                    if (intent.hasExtra("record_interactions_endpoint")) {
                        byte[] byteArray = intent.getExtras().getByteArray("record_interactions_endpoint");
                        aopc aopcVar = (aopc) apzg.a.createBuilder();
                        if (byteArray != null) {
                            try {
                                aopcVar.mo38mergeFrom(byteArray, aoos.b());
                            } catch (aopx unused) {
                            }
                        }
                        this.b.c((apzg) aopcVar.mo39build(), null);
                    }
                    String g = agee.g(intent);
                    if (!TextUtils.isEmpty(g)) {
                        agcj.e(this.w, g);
                    }
                    i = 4;
                } else {
                    int i2 = 2;
                    if (intent.hasExtra("pane")) {
                        PaneDescriptor paneDescriptor = (PaneDescriptor) intent.getExtras().getParcelable("pane");
                        ojl ojlVar = this.c;
                        if (true != z) {
                            i2 = 0;
                        }
                        ojlVar.r(paneDescriptor, i2);
                    } else if (intent.hasExtra("watch")) {
                        Bundle extras = intent.getExtras();
                        emo emoVar = this.u;
                        ezt b3 = ezu.b();
                        b3.f((WatchDescriptor) extras.getParcelable("watch"));
                        b3.d(extras.getInt("playback_start_flag", 0));
                        emoVar.g(b3.a());
                        i = 1;
                    } else if (intent.hasExtra("alias")) {
                        String stringExtra = intent.getStringExtra("alias");
                        if (!stringExtra.equals(Shell_HomeActivity.class.getName())) {
                            if (!stringExtra.equals(Shell_ResultsActivity.class.getName())) {
                                if (stringExtra.equals(Shell_MediaSearchActivity.class.getName()) && (b = WatchDescriptor.b(intent)) != null) {
                                    emo emoVar2 = this.u;
                                    ezt b4 = ezu.b();
                                    b4.f(b);
                                    emoVar2.g(b4.a());
                                    i = 1;
                                }
                                i = 0;
                            } else {
                                if (true == m(intent)) {
                                    i = 2;
                                }
                                i = 0;
                            }
                        } else {
                            String action3 = intent.getAction();
                            this.f = true;
                            if (!TextUtils.isEmpty(action3)) {
                                String trim = action3.trim();
                                amum h = amup.h();
                                h.f("com.google.android.youtube.action.open.subscriptions", "FEsubscriptions");
                                h.f("com.google.android.youtube.action.open.explore", "FEexplore");
                                ampq b5 = ampq.i((String) h.b().get(trim)).b(meo.m).b(new ampg() { // from class: oit
                                    @Override // defpackage.ampg
                                    public final Object apply(Object obj) {
                                        return oiw.this.d.b((apzg) obj, true);
                                    }
                                });
                                if (b5.h()) {
                                    this.c.d((PaneDescriptor) b5.c());
                                }
                            }
                        }
                        if (i != 0 || !intent.hasExtra("query")) {
                            i2 = i;
                        } else if (true != m(intent)) {
                            i2 = 0;
                        }
                        if (i2 == 0) {
                            Uri data = intent.getData();
                            if (data == null && intent.hasExtra("playlist_uri")) {
                                data = (Uri) intent.getParcelableExtra("playlist_uri");
                            }
                            if (data != null) {
                                String a = yja.a(this.a, intent);
                                settableFuture = SettableFuture.f();
                                this.n.o(data, a, new oiv(this, data, intent, settableFuture));
                            }
                            i = settableFuture != null ? 5 : 0;
                        } else {
                            i = i2;
                        }
                    } else {
                        if (!TextUtils.equals("android.intent.action.SEARCH", intent.getAction()) || !intent.hasExtra("query")) {
                            if (intent.hasExtra("video_picker")) {
                                this.c.d(this.d.a(aafr.a("FEvideo_picker")));
                                this.h = true;
                                this.v.n = true;
                            }
                        } else if (true == m(intent)) {
                            i = 2;
                        }
                        i = 0;
                    }
                }
                if (intent.hasExtra("android.intent.extra.REFERRER_NAME") && intent.getStringExtra("android.intent.extra.REFERRER_NAME") != null) {
                    acrr acrrVar = this.q;
                    String stringExtra2 = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    aopa createBuilder = asxt.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asxt asxtVar = (asxt) createBuilder.instance;
                    stringExtra2.getClass();
                    asxtVar.b |= 1;
                    asxtVar.c = stringExtra2;
                    arrf a2 = arrh.a();
                    a2.copyOnWrite();
                    ((arrh) a2.instance).cR((asxt) createBuilder.mo39build());
                    acrrVar.c((arrh) a2.mo39build());
                }
                if (!this.f) {
                    this.o.b();
                }
                if (i != 1 && i != 5) {
                    e();
                }
                this.g = true;
                if (i == 4 || i == 5) {
                    this.l.c();
                }
                if (settableFuture != null) {
                    return settableFuture;
                }
                if (i == 0) {
                    z2 = false;
                }
                return anlz.q(Boolean.valueOf(z2));
            }
            if (eog.aw(eidVar.b)) {
                aopa createBuilder2 = aphw.a.createBuilder();
                String num = Integer.toString(10049);
                createBuilder2.copyOnWrite();
                aphw aphwVar = (aphw) createBuilder2.instance;
                num.getClass();
                aphwVar.b |= 8;
                aphwVar.e = num;
                aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                aopcVar2.e(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (aphw) createBuilder2.mo39build());
                ((aafo) eidVar.a.get()).c((apzg) aopcVar2.mo39build(), null);
            }
            this.v.n = true;
            return anlz.q(Boolean.TRUE);
        }
        aafo aafoVar3 = ondVar.a;
        aopa createBuilder3 = apnv.a.createBuilder();
        createBuilder3.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder3.instance;
        apnvVar.b |= 1;
        apnvVar.c = "SPtime_watched";
        aopc aopcVar3 = (aopc) apzg.a.createBuilder();
        aopcVar3.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder3.mo39build());
        aafoVar3.c((apzg) aopcVar3.mo39build(), null);
        this.v.n = true;
        return anlz.q(Boolean.TRUE);
    }

    private final void k(ankt anktVar) {
        ankt anktVar2 = this.E;
        if (anktVar2 != null) {
            anktVar2.cancel(true);
        }
        this.E = anktVar;
        if (l()) {
            anktVar.qY(new Runnable() { // from class: oiu
                @Override // java.lang.Runnable
                public final void run() {
                    oiw.this.g();
                }
            }, this.x);
        } else {
            g();
        }
    }

    private final boolean l() {
        ankt anktVar = this.E;
        return anktVar == null || (!anktVar.isDone() && !this.E.isCancelled());
    }

    private final boolean m(Intent intent) {
        String stringExtra = intent.getStringExtra("query");
        if (stringExtra == null) {
            return false;
        }
        ArrayList<String> arrayList = new ArrayList();
        if (stringExtra.contains("is:channel")) {
            arrayList.add("search_filter=channel");
        } else if (stringExtra.contains("is:playlists")) {
            arrayList.add("search_filter=playlist");
        }
        String trim = stringExtra.replace("is:channel", "").replace("is:playlists", "").trim();
        ghn ghnVar = (ghn) intent.getSerializableExtra("selected_time_filter");
        if (ghnVar != null) {
            int ordinal = ghnVar.ordinal();
            if (ordinal == 0) {
                arrayList.add("search_filter=live");
            } else if (ordinal == 1) {
                arrayList.add("search_filter=today");
            } else if (ordinal == 2) {
                arrayList.add("search_filter=week");
            } else if (ordinal == 3) {
                arrayList.add("search_filter=month");
            }
        }
        aopa createBuilder = auwg.a.createBuilder();
        if (!arrayList.isEmpty()) {
            aopa createBuilder2 = auwe.a.createBuilder();
            createBuilder2.copyOnWrite();
            auwe auweVar = (auwe) createBuilder2.instance;
            auweVar.b |= 1;
            auweVar.d = true;
            for (String str : arrayList) {
                aopa createBuilder3 = auwf.a.createBuilder();
                createBuilder3.copyOnWrite();
                auwf auwfVar = (auwf) createBuilder3.instance;
                str.getClass();
                auwfVar.b |= 4;
                auwfVar.e = str;
                createBuilder3.copyOnWrite();
                auwf auwfVar2 = (auwf) createBuilder3.instance;
                auwfVar2.d = 2;
                auwfVar2.b |= 2;
                createBuilder2.copyOnWrite();
                auwe auweVar2 = (auwe) createBuilder2.instance;
                auwf auwfVar3 = (auwf) createBuilder3.mo39build();
                auwfVar3.getClass();
                auweVar2.a();
                auweVar2.c.add(auwfVar3);
            }
            auwe auweVar3 = (auwe) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            auwg auwgVar = (auwg) createBuilder.instance;
            auweVar3.getClass();
            auwgVar.a();
            auwgVar.b.add(auweVar3);
        }
        ojl ojlVar = this.c;
        kwa kwaVar = this.A;
        auwg auwgVar2 = (auwg) createBuilder.mo39build();
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = SearchEndpointOuterClass.searchEndpoint;
        aopc aopcVar2 = (aopc) auoy.a.createBuilder();
        aopcVar2.copyOnWrite();
        auoy auoyVar = (auoy) aopcVar2.instance;
        trim.getClass();
        auoyVar.b |= 1;
        auoyVar.c = trim;
        aopcVar.e(aopgVar, (auoy) aopcVar2.mo39build());
        ojlVar.d(kwaVar.a((apzg) aopcVar.mo39build(), auwgVar2, null, false, null, false, false, 0, 0));
        return true;
    }

    private final boolean n() {
        return eog.aP(this.F) && this.m.c().y();
    }

    @Override // defpackage.ghv
    public final void a(jwc jwcVar) {
        if (l()) {
            this.y.add(jwcVar);
        } else {
            jwcVar.a();
        }
    }

    @Override // defpackage.ghv
    public final void b(jwc jwcVar) {
        this.y.remove(jwcVar);
    }

    public final void c(Intent intent, Bundle bundle) {
        ankt q;
        if (n()) {
            this.i = intent;
            this.j = bundle;
            return;
        }
        if (bundle != null) {
            try {
                e();
                this.g = bundle.getBoolean("has_handled_intent", false);
            } catch (BadParcelableException e) {
                zep.d("handleIntent failed", e);
                q = anlz.q(Boolean.FALSE);
            }
        }
        if (this.g || intent == null) {
            q = anlz.q(Boolean.FALSE);
        } else {
            if (i(intent) && this.r != null) {
                oa oaVar = this.a;
                String action = intent.getAction();
                if (Build.VERSION.SDK_INT >= 25) {
                    ((ShortcutManager) oaVar.getSystemService(ShortcutManager.class)).reportShortcutUsed(action);
                }
            }
            if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
                this.e = true;
                q = anlz.q(Boolean.TRUE);
            } else {
                q = j(intent, true);
            }
        }
        k(q);
    }

    public final void d(Intent intent) {
        ankt q;
        if (!n()) {
            e();
            if (intent.hasExtra("background_failed_dismissible_dialog") || intent.hasExtra("background_failed_upsell_dialog") || intent.hasExtra("background_failed_upsell_dialog_on_elements")) {
                ((ent) this.p.get()).d = true;
                q = anlz.q(Boolean.TRUE);
            } else {
                this.g = false;
                if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
                    if (i(intent)) {
                        this.e = true;
                    } else {
                        this.a.onSearchRequested();
                    }
                    q = anlz.q(Boolean.TRUE);
                } else {
                    q = j(intent, false);
                }
            }
            k(q);
            return;
        }
        this.i = intent;
        this.j = null;
    }

    public final void e() {
        if (this.C.j(ahfv.class)) {
            this.D.d(new evx());
        }
        this.B.b();
    }

    public final void g() {
        for (jwc jwcVar : this.y) {
            jwcVar.a();
        }
        this.y.clear();
    }

    public final void h() {
        this.e = false;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                Intent intent = this.i;
                if (intent == null) {
                    return null;
                }
                Bundle bundle = this.j;
                if (bundle == null) {
                    d(intent);
                } else {
                    c(intent, bundle);
                }
                this.i = null;
                this.j = null;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }
}
