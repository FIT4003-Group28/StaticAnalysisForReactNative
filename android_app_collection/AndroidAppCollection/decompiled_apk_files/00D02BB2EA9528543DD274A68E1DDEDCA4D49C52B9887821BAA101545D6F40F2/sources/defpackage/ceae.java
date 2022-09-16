package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.text.InputFilter;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.gmm.review.impl.MaterialProgressSpinner;
import com.google.android.apps.gmm.ugc.post.photo.KeyboardObserver;
import com.google.android.apps.gmm.ugc.post.photo.MediaCarousel;
import com.google.android.apps.gmm.ugc.post.photo.MediaGallery;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ceae  reason: default package */
/* loaded from: classes4.dex */
public final class ceae extends ges {
    public btvo a;
    public gdc ad;
    public cdzd ae;
    public Dialog af;
    public ceaw ag;
    public cduy ah;
    public ModAppBar ai;
    public EditText aj;
    public RecyclerView ak;
    public boolean al;
    public boolean am;
    private KeyboardObserver ar;
    private qy as;
    private cdyo at;
    private ConstraintLayout au;
    public efg b;
    public ceax c;
    public bwqv d;
    public cdys e;
    public cebd f;
    public chhr g;
    private final ds an = new ds();
    private final ds ao = new ds();
    private final dzss ap = aom.a(this, dzwe.a(ceaj.class), new cdza(new cdyz(this)));
    private final dzss aq = aom.a(this, dzwe.a(cdog.class), new cdzc(new cdzb(this)));
    private int ax = 1;
    private final cdzt av = new cdzt(this);
    private final cdze aw = new cdze(this);

    public static final /* synthetic */ Dialog aS(ceae ceaeVar) {
        Dialog dialog = ceaeVar.af;
        if (dialog == null) {
            dzvx.a("publishingDialog");
        }
        return dialog;
    }

    public static final /* synthetic */ cdyo aT(ceae ceaeVar) {
        cdyo cdyoVar = ceaeVar.at;
        if (cdyoVar == null) {
            dzvx.a("galleryListAdapter");
        }
        return cdyoVar;
    }

    private final cdog aV() {
        return (cdog) this.aq.a();
    }

    private final cjtd aX(ddho ddhoVar) {
        cdzd cdzdVar = this.ae;
        if (cdzdVar == null) {
            dzvx.a("options");
        }
        cjta c = cjtd.c(cdzdVar.d().bZ());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.ak = null;
        this.aj = null;
        this.ai = null;
        this.au = null;
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dmbc i;
        super.Qi(context);
        if (context instanceof Activity) {
            Bundle bundle = this.o;
            bwqv bwqvVar = this.d;
            if (bwqvVar == null) {
                dzvx.a("gmmStorage");
            }
            dzvx.c(bwqvVar, "gmmStorage");
            if (bundle == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            try {
                bwrs e = bwqvVar.e(ilo.class, bundle, "PLACEMARK_REF");
                if (e == null) {
                    throw new IllegalStateException("Placemark storage reference was null".toString());
                }
                if (e.c() == null) {
                    throw new IllegalStateException("Placemark was null".toString());
                }
                try {
                    try {
                        this.ae = new cdur(e, (dnqh) bvrs.b(bundle.getByteArray("LOGGING_PARAMS"), (dssr) dnqh.p.cu(7)), (cdjd) bwqvVar.d(cdjd.class, bundle, "POST"));
                        gdc gdcVar = this.ad;
                        if (gdcVar == null) {
                            dzvx.a("gmmAlertDialogFactory");
                        }
                        gcz a = gdcVar.a();
                        a.d(R.string.photo_posts_exit_dialog_message);
                        a.i = aX(dtyd.C);
                        a.e(R.string.photo_posts_exit_dialog_cancel_exit_action, aX(dtyd.D), cdzi.a);
                        a.h(R.string.photo_posts_exit_dialog_discard_action, aX(dtyd.E), new cdzj(this));
                        this.as = a.a();
                        this.af = new MaterialProgressSpinner(this.aE);
                        cdzd cdzdVar = this.ae;
                        if (cdzdVar == null) {
                            dzvx.a("options");
                        }
                        cdjd cdjdVar = ((cdur) cdzdVar).c;
                        dmbc dmbcVar = null;
                        if (cdjdVar != null && (i = cdjdVar.i()) != null) {
                            dsqp dsqpVar = (dsqp) i.cu(5);
                            dsqpVar.bC(i);
                            dmbb dmbbVar = (dmbb) dsqpVar;
                            if (dmbbVar != null) {
                                dmbu dmbuVar = ((dmbc) dmbbVar.b).c;
                                if (dmbuVar == null) {
                                    dmbuVar = dmbu.i;
                                }
                                dsqp dsqpVar2 = (dsqp) dmbuVar.cu(5);
                                dsqpVar2.bC(dmbuVar);
                                dmbr dmbrVar = (dmbr) dsqpVar2;
                                if (dmbrVar.c) {
                                    dmbrVar.bF();
                                    dmbrVar.c = false;
                                }
                                dmbu dmbuVar2 = (dmbu) dmbrVar.b;
                                dmbuVar2.d = 1;
                                dmbuVar2.a |= 8;
                                dmbu bK = dmbrVar.bK();
                                if (dmbbVar.c) {
                                    dmbbVar.bF();
                                    dmbbVar.c = false;
                                }
                                dmbc dmbcVar2 = (dmbc) dmbbVar.b;
                                bK.getClass();
                                dmbcVar2.c = bK;
                                dmbcVar2.a |= 2;
                                dmbcVar = dmbbVar.bK();
                            }
                        }
                        dmbc dmbcVar3 = dmbcVar;
                        ceax ceaxVar = this.c;
                        if (ceaxVar == null) {
                            dzvx.a("photoPostSubmitterFactory");
                        }
                        cdzd cdzdVar2 = this.ae;
                        if (cdzdVar2 == null) {
                            dzvx.a("options");
                        }
                        bwrs<ilo> bwrsVar = ((cdur) cdzdVar2).a;
                        dwyd dwydVar = dwyd.PLACE_PAGE_PHOTO_UPDATES;
                        cdzd cdzdVar3 = this.ae;
                        if (cdzdVar3 == null) {
                            dzvx.a("options");
                        }
                        dnqh dnqhVar = ((cdur) cdzdVar3).b;
                        ceax.a(bwrsVar, 2);
                        ceax.a(dwydVar, 3);
                        ceax.a(dnqhVar, 4);
                        bbul a2 = ceaxVar.a.a();
                        ceax.a(a2, 5);
                        akfc a3 = ceaxVar.b.a();
                        ceax.a(a3, 6);
                        bbtk a4 = ceaxVar.c.a();
                        ceax.a(a4, 7);
                        btrm a5 = ceaxVar.d.a();
                        ceax.a(a5, 8);
                        bulj a6 = ceaxVar.e.a();
                        ceax.a(a6, 9);
                        buzx a7 = ceaxVar.f.a();
                        ceax.a(a7, 10);
                        Executor a8 = ceaxVar.g.a();
                        ceax.a(a8, 11);
                        ceaw ceawVar = new ceaw(dmbcVar3, bwrsVar, dwydVar, dnqhVar, a2, a3, a4, a5, a6, a7, a8);
                        ceawVar.d.b(this, new cdzg(this, context));
                        ceawVar.e.b(this, new cdzh(this));
                        this.ag = ceawVar;
                        KeyboardObserver keyboardObserver = new KeyboardObserver((Activity) context);
                        this.Z.a(keyboardObserver);
                        this.ar = keyboardObserver;
                        cebd cebdVar = this.f;
                        if (cebdVar == null) {
                            dzvx.a("userEvent3Logger");
                        }
                        cdzd cdzdVar4 = this.ae;
                        if (cdzdVar4 == null) {
                            dzvx.a("options");
                        }
                        cduy cduyVar = new cduy(cebdVar, cdzdVar4.d(), new cdzk(this));
                        cduyVar.o(this.aw);
                        this.ah = cduyVar;
                        return;
                    } catch (IOException e2) {
                        throw new IllegalStateException("Could not re-construct LoggingParam", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalStateException("Could not re-construct Post", e3);
                }
            } catch (IOException e4) {
                throw new IllegalStateException("Could not re-construct Placemark", e4);
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        if (obj instanceof bbuf) {
            cdzt cdztVar = this.av;
            List<bbtm> a = ((bbuf) obj).a();
            dzvx.b(a, "result.photoMetadata");
            ArrayList arrayList = new ArrayList(dzti.d(a, 10));
            for (bbtm bbtmVar : a) {
                dzvx.b(bbtmVar, "it");
                arrayList.add(bbtmVar.z());
            }
            cdztVar.a(arrayList);
        }
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        cdys cdysVar = this.e;
        if (cdysVar == null) {
            dzvx.a("mediaPickerManager");
        }
        if (intent != null) {
            bdpk bdpkVar = cdysVar.h;
            dbsk.s(bdpkVar);
            if (bdpkVar.d(i, i2, intent)) {
                return;
            }
        }
        super.Z(i, i2, intent);
    }

    public final void aJ() {
        w();
        ff J = J();
        if (J != null) {
            J.g().e();
        }
    }

    public final dmbc aR() {
        String str;
        dmbb bZ = dmbc.h.bZ();
        dmbr bZ2 = dmbu.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmbu dmbuVar = (dmbu) bZ2.b;
        dmbuVar.d = 2;
        dmbuVar.a |= 8;
        cdzd cdzdVar = this.ae;
        if (cdzdVar == null) {
            dzvx.a("options");
        }
        akqi ai = cdzdVar.d().ai();
        dzvx.b(ai, "options.placemark.featureId");
        String o = ai.o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmbu dmbuVar2 = (dmbu) bZ2.b;
        o.getClass();
        dmbuVar2.a |= 1;
        dmbuVar2.b = o;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmbc dmbcVar = (dmbc) bZ.b;
        dmbu bK = bZ2.bK();
        bK.getClass();
        dmbcVar.c = bK;
        dmbcVar.a |= 2;
        dmbf bZ3 = dmbg.i.bZ();
        CharSequence h = g().f.h();
        if (h == null || (str = h.toString()) == null) {
            str = "";
        }
        List<Uri> h2 = g().d.h();
        if (h2 == null) {
            h2 = dztu.a;
        }
        ArrayList arrayList = new ArrayList(dzti.d(h2, 10));
        for (Uri uri : h2) {
            dmax bZ4 = dmay.d.bZ();
            Map<Uri, String> h3 = g().h.h();
            if (h3 == null) {
                h3 = dztv.a;
            }
            String str2 = h3.get(uri);
            if (str2 == null) {
                str2 = uri.toString();
            }
            String str3 = str2;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dmay dmayVar = (dmay) bZ4.b;
            str3.getClass();
            dmayVar.a |= 1;
            dmayVar.b = str3;
            dwfi bZ5 = dwfl.w.bZ();
            dizg bZ6 = dizh.j.bZ();
            dghj bZ7 = dghk.g.bZ();
            dggc dggcVar = dggc.PHOTO;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dghk dghkVar = (dghk) bZ7.b;
            dghkVar.b = dggcVar.f;
            dghkVar.a |= 2;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dizh dizhVar = (dizh) bZ6.b;
            dghk bK2 = bZ7.bK();
            bK2.getClass();
            dizhVar.c = bK2;
            dizhVar.a |= 2;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dwfl dwflVar = (dwfl) bZ5.b;
            dizh bK3 = bZ6.bK();
            bK3.getClass();
            dwflVar.p = bK3;
            dwflVar.a |= 32768;
            String uri2 = uri.toString();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dwfl dwflVar2 = (dwfl) bZ5.b;
            uri2.getClass();
            dwflVar2.a |= 128;
            dwflVar2.h = uri2;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dmay dmayVar2 = (dmay) bZ4.b;
            dwfl bK4 = bZ5.bK();
            bK4.getClass();
            dmayVar2.c = bK4;
            dmayVar2.a |= 4;
            arrayList.add(bZ4.bK());
        }
        dmcb bZ8 = dmcc.i.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dmcc dmccVar = (dmcc) bZ8.b;
        str.getClass();
        dmccVar.a |= 1;
        dmccVar.b = str;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmbg dmbgVar = (dmbg) bZ3.b;
        dmcc bK5 = bZ8.bK();
        bK5.getClass();
        dmbgVar.c = bK5;
        dmbgVar.a = 2 | dmbgVar.a;
        bZ3.a(arrayList);
        dmce f = aV().c().f();
        if (f != null) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dmbg dmbgVar2 = (dmbg) bZ3.b;
            f.getClass();
            dmbgVar2.e = f;
            dmbgVar2.a |= 4;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmbc dmbcVar2 = (dmbc) bZ.b;
        dmbg dmbgVar3 = (dmbg) bZ3.bK();
        dmbgVar3.getClass();
        dmbcVar2.d = dmbgVar3;
        dmbcVar2.a |= 4;
        dmbc bK6 = bZ.bK();
        dzvx.b(bK6, "Post.newBuilder()\n      …      }\n        ).build()");
        return bK6;
    }

    public final void aU(int i) {
        ds dsVar;
        if (i != this.ax) {
            Resources Rn = Rn();
            dzvx.b(Rn, "resources");
            boolean z = true;
            if (Rn.getConfiguration().orientation != 1) {
                return;
            }
            EditText editText = this.aj;
            if (editText != null) {
                editText.setSingleLine(i == 2);
                editText.setMaxLines(i == 2 ? 1 : 4);
            }
            ModAppBar modAppBar = this.ai;
            if (modAppBar != null) {
                if (i != 2) {
                    z = false;
                }
                modAppBar.l(z);
            }
            ConstraintLayout constraintLayout = this.au;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setInterpolator(new OvershootInterpolator(1.0f));
            changeBounds.setDuration(400L);
            TransitionManager.beginDelayedTransition(constraintLayout, changeBounds);
            ceap ceapVar = ceap.EDITING;
            cdvi cdviVar = cdvi.MEDIA_CAPTURE;
            if (i - 1 == 0) {
                dsVar = this.an;
            } else {
                w();
                dsVar = this.ao;
            }
            dsVar.d(this.au);
            this.ax = i;
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dzvx.c(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.photo_post_editor_fragment, viewGroup, false);
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        dzvx.c(view, "view");
        this.ao.a(H(), R.layout.photo_post_editor_gallery_expanded);
        KeyboardObserver keyboardObserver = this.ar;
        if (keyboardObserver == null) {
            dzvx.a("keyboardObserver");
        }
        keyboardObserver.a.b(x(), new cdzs(this));
        cebd cebdVar = this.f;
        if (cebdVar == null) {
            dzvx.a("userEvent3Logger");
        }
        cdvv a = cdvv.a(this, cebdVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.editor);
        this.an.c(constraintLayout);
        this.au = constraintLayout;
        ModAppBar modAppBar = (ModAppBar) view.findViewById(R.id.appBar);
        cdzd cdzdVar = this.ae;
        if (cdzdVar == null) {
            dzvx.a("options");
        }
        String q = cdzdVar.d().q();
        dzvx.b(q, "placemark.clientSideTitle");
        modAppBar.setTitle(q);
        modAppBar.setCoverStatusBar(false);
        modAppBar.setNavIcon(modAppBar.getResources().getDrawable(2131231591));
        modAppBar.setNavButtonContentDescription(Rp(R.string.photo_posts_cancel_description));
        modAppBar.setNavButtonClickListener(new cdzv(this));
        modAppBar.setNavButtonUe3Params(aX(dtyd.A));
        q(modAppBar, false);
        this.ai = modAppBar;
        a.b(R.id.postingPublicly).c(aX(dtyd.F));
        EditText editText = (EditText) view.findViewById(R.id.photoComment);
        this.aj = editText;
        if (editText != null) {
            InputFilter[] inputFilterArr = new InputFilter[1];
            btvo btvoVar = this.a;
            if (btvoVar == null) {
                dzvx.a("clientParameters");
            }
            dkyr ugcParameters = btvoVar.getUgcParameters();
            dzvx.b(ugcParameters, "clientParameters.ugcParameters");
            inputFilterArr[0] = new InputFilter.LengthFilter(ugcParameters.a());
            editText.setFilters(inputFilterArr);
        }
        EditText editText2 = this.aj;
        if (editText2 != null) {
            editText2.setOnTouchListener(cdzy.a);
        }
        cdwi b = a.b(R.id.photoComment);
        b.f(g().f);
        b.c(aX(dtyd.B));
        b.a(new cdzz(this));
        g().g.b(x(), new ceaa(this));
        g().i.b(x(), new ceab(this));
        view.findViewById(R.id.grabber).setOnClickListener(new ceac(this));
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.editorContainer);
        nestedScrollView.getViewTreeObserver().addOnScrollChangedListener(new cdzw(nestedScrollView, this));
        View findViewById = view.findViewById(R.id.carousel);
        MediaCarousel mediaCarousel = (MediaCarousel) findViewById;
        cduy cduyVar = this.ah;
        if (cduyVar == null) {
            dzvx.a("carouselListAdapter");
        }
        mediaCarousel.setAdapter(cduyVar);
        mediaCarousel.setOnTouchListener(new cdzx(this));
        this.ak = (RecyclerView) findViewById;
        a.b(R.id.carousel).c(aX(dtyd.H));
        View findViewById2 = view.findViewById(R.id.gallery);
        dzvx.b(findViewById2, "findViewById<MediaGallery>(R.id.gallery)");
        MediaGallery mediaGallery = (MediaGallery) findViewById2;
        cdyo cdyoVar = this.at;
        if (cdyoVar == null) {
            dzvx.a("galleryListAdapter");
        }
        mediaGallery.setAdapter(cdyoVar);
        mediaGallery.setOnGallerySizeChange(new cead(this));
        a.b(R.id.gallery).c(aX(dtyd.K));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        if (!this.al) {
            cdys cdysVar = this.e;
            if (cdysVar == null) {
                dzvx.a("mediaPickerManager");
            }
            bdof bdofVar = cdysVar.g;
            dbsk.s(bdofVar);
            bdofVar.d();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ceaw ceawVar = this.ag;
        if (ceawVar == null) {
            dzvx.a("photoPostSubmitter");
        }
        ceawVar.c(aR());
        if (this.ax == 2) {
            aU(1);
            return true;
        } else if (!this.am) {
            return false;
        } else {
            qy qyVar = this.as;
            if (qyVar == null) {
                dzvx.a("exitDialog");
            }
            qyVar.show();
            return true;
        }
    }

    public final ceaj g() {
        return (ceaj) this.ap.a();
    }

    public final List<Uri> i(List<? extends Uri> list) {
        ContentResolver contentResolver;
        dzvx.c(list, "$this$withoutGifs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Uri uri = (Uri) obj;
            ff J = J();
            String str = null;
            if (J != null && (contentResolver = J.getContentResolver()) != null) {
                str = contentResolver.getType(uri);
            }
            if (str == null || !str.equals("image/gif")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceae.l(android.os.Bundle):void");
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        dzvx.c(configuration, "config");
        ff J = J();
        if (J != null) {
            gz b = J.g().b();
            b.t(this);
            b.A(this);
            b.f();
        }
        aU(1);
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.G;
    }

    public final void q(ModAppBar modAppBar, boolean z) {
        jhm a = jhm.a();
        a.a = Rp(R.string.photo_posts_create);
        a.n = z;
        a.d(new cdzu(this));
        a.f = aX(dtyd.M);
        modAppBar.setActionMenuItems(dzti.a(a.c()));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        if (efgVar == null) {
            dzvx.a("uiTransitionStateApplier");
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("areGalleryMediaInitialized", this.al);
        cdyo cdyoVar = this.at;
        if (cdyoVar == null) {
            dzvx.a("galleryListAdapter");
        }
        List<? extends Uri> list = cdyoVar.f;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        dzti.j(list, arrayList);
        bundle.putParcelableArrayList("galleryMedia", arrayList);
    }

    public final void w() {
        View view;
        IBinder windowToken;
        ff J = J();
        InputMethodManager inputMethodManager = null;
        Object systemService = J != null ? J.getSystemService("input_method") : null;
        if (true == (systemService instanceof InputMethodManager)) {
            inputMethodManager = systemService;
        }
        InputMethodManager inputMethodManager2 = inputMethodManager;
        if (inputMethodManager2 == null || (view = this.P) == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        inputMethodManager2.hideSoftInputFromWindow(windowToken, 0);
    }
}
