package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.hardware.Camera;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bbyy  reason: default package */
/* loaded from: classes3.dex */
public class bbyy implements bbyg {
    public static final /* synthetic */ int r = 0;
    private static final dcqe s = dcqe.c("bbyy");
    private static final dcdc<String> t = dcdc.h("off", "auto", "on");
    private static final dcep<String> u = dcep.C("com.google.android.apps.photos", "com.google.android.gallery3d");
    private final bwrs<bcan> A;
    private final dxio<apni> B;
    private final View.OnTouchListener D;
    private final bcpk H;
    public final bbwq a;
    public final gga b;
    public final bbut c;
    public final bvrb d;
    public final bcpe e;
    public final isd f;
    public final cqat g;
    public final bbwi h;
    public final bcoz i;
    public final bcan j;
    public final bbts k;
    public final bduz q;
    private final dxio<afha> v;
    private final bbtk w;
    private final bbzf x;
    private final axru y;
    private final axrx z;
    public int l = 0;
    public boolean m = false;
    public boolean n = false;
    public long o = 0;
    public boolean p = false;
    private final Map<Uri, bbye> C = new HashMap();
    @dzsi
    private List<String> E = null;
    private final View.OnTouchListener F = new bbyq(this);
    private final cqkn<bbyg> G = new bbys(this);

    public bbyy(bbwq bbwqVar, bwrs bwrsVar, bbts bbtsVar, cqat cqatVar, gga ggaVar, bbut bbutVar, dxio dxioVar, bbwo bbwoVar, bbtk bbtkVar, bvrb bvrbVar, bbzf bbzfVar, bcpk bcpkVar, bcpe bcpeVar, bcoz bcozVar, dxio dxioVar2, isd isdVar, axru axruVar, axrx axrxVar) {
        new bbyv(this);
        this.a = bbwqVar;
        this.A = bwrsVar;
        bcan bcanVar = (bcan) bwrsVar.c();
        dbsk.s(bcanVar);
        this.j = bcanVar;
        this.g = cqatVar;
        this.e = bcpeVar;
        this.k = bbtsVar;
        this.B = dxioVar2;
        this.f = isdVar;
        this.z = axrxVar;
        this.y = axruVar;
        this.q = new bduz(ggaVar, new bbyt(this));
        this.D = new View.OnTouchListener(this) { // from class: bbyh
            private final bbyy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MotionEvent motionEvent2;
                GestureDetector.OnDoubleTapListener onDoubleTapListener;
                bduz bduzVar = this.a.q;
                bdus bdusVar = bduzVar.a.a;
                int action = motionEvent.getAction();
                bduu bduuVar = (bduu) bdusVar;
                if (bduuVar.v == null) {
                    bduuVar.v = VelocityTracker.obtain();
                }
                bduuVar.v.addMovement(motionEvent);
                int i = action & 255;
                int actionIndex = i == 6 ? motionEvent.getActionIndex() : -1;
                int pointerCount = motionEvent.getPointerCount();
                float f = 0.0f;
                float f2 = 0.0f;
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    if (actionIndex != i2) {
                        f += motionEvent.getX(i2);
                        f2 += motionEvent.getY(i2);
                    }
                }
                float f3 = i == 6 ? pointerCount - 1 : pointerCount;
                float f4 = f / f3;
                float f5 = f2 / f3;
                if (i == 0) {
                    if (bduuVar.h != null) {
                        boolean hasMessages = bduuVar.f.hasMessages(3);
                        if (hasMessages) {
                            bduuVar.f.removeMessages(3);
                        }
                        MotionEvent motionEvent3 = bduuVar.n;
                        if (motionEvent3 != null && (motionEvent2 = bduuVar.o) != null && hasMessages && bduuVar.m && motionEvent.getEventTime() - motionEvent2.getEventTime() <= bduu.e) {
                            int x = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                            int y = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                            if ((x * x) + (y * y) < bduuVar.b) {
                                bduuVar.p = true;
                                bduuVar.h.onDoubleTap(bduuVar.n);
                                bduuVar.h.onDoubleTapEvent(motionEvent);
                            }
                        }
                        bduuVar.f.sendEmptyMessageDelayed(3, bduu.e);
                    }
                    bduuVar.q = f4;
                    bduuVar.s = f4;
                    bduuVar.r = f5;
                    bduuVar.t = f5;
                    MotionEvent motionEvent4 = bduuVar.n;
                    if (motionEvent4 != null) {
                        motionEvent4.recycle();
                    }
                    bduuVar.n = MotionEvent.obtain(motionEvent);
                    bduuVar.l = true;
                    bduuVar.m = true;
                    bduuVar.i = true;
                    bduuVar.k = false;
                    bduuVar.j = false;
                    if (bduuVar.u) {
                        bduuVar.f.removeMessages(2);
                        bduuVar.f.sendEmptyMessageAtTime(2, bduuVar.n.getDownTime() + 200);
                    }
                    bduuVar.f.sendEmptyMessageAtTime(1, bduuVar.n.getDownTime());
                    bduuVar.g.onDown(motionEvent);
                } else if (i == 1) {
                    bduuVar.i = false;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    if (bduuVar.p) {
                        bduuVar.h.onDoubleTapEvent(motionEvent);
                    } else if (bduuVar.k) {
                        bduuVar.f.removeMessages(3);
                        bduuVar.k = false;
                    } else if (bduuVar.l) {
                        bduuVar.g.onSingleTapUp(motionEvent);
                        if (bduuVar.j && (onDoubleTapListener = bduuVar.h) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                    } else {
                        VelocityTracker velocityTracker = bduuVar.v;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, bduuVar.d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > bduuVar.c || Math.abs(xVelocity) > bduuVar.c) {
                            bduuVar.g.onFling(bduuVar.n, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    MotionEvent motionEvent5 = bduuVar.o;
                    if (motionEvent5 != null) {
                        motionEvent5.recycle();
                    }
                    bduuVar.o = obtain;
                    VelocityTracker velocityTracker2 = bduuVar.v;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        bduuVar.v = null;
                    }
                    bduuVar.p = false;
                    bduuVar.j = false;
                    bduuVar.f.removeMessages(1);
                    bduuVar.f.removeMessages(2);
                } else if (i != 2) {
                    if (i == 3) {
                        bduuVar.f.removeMessages(1);
                        bduuVar.f.removeMessages(2);
                        bduuVar.f.removeMessages(3);
                        bduuVar.v.recycle();
                        bduuVar.v = null;
                        bduuVar.p = false;
                        bduuVar.i = false;
                        bduuVar.l = false;
                        bduuVar.m = false;
                        bduuVar.j = false;
                        if (bduuVar.k) {
                            bduuVar.k = false;
                        }
                    } else if (i == 5) {
                        bduuVar.q = f4;
                        bduuVar.s = f4;
                        bduuVar.r = f5;
                        bduuVar.t = f5;
                        bduuVar.f.removeMessages(1);
                        bduuVar.f.removeMessages(2);
                        bduuVar.f.removeMessages(3);
                        bduuVar.p = false;
                        bduuVar.l = false;
                        bduuVar.m = false;
                        bduuVar.j = false;
                        if (bduuVar.k) {
                            bduuVar.k = false;
                        }
                    } else if (i == 6) {
                        bduuVar.q = f4;
                        bduuVar.s = f4;
                        bduuVar.r = f5;
                        bduuVar.t = f5;
                        bduuVar.v.computeCurrentVelocity(1000, bduuVar.d);
                        int actionIndex2 = motionEvent.getActionIndex();
                        int pointerId2 = motionEvent.getPointerId(actionIndex2);
                        float xVelocity2 = bduuVar.v.getXVelocity(pointerId2);
                        float yVelocity2 = bduuVar.v.getYVelocity(pointerId2);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= pointerCount) {
                                break;
                            }
                            if (i3 != actionIndex2) {
                                int pointerId3 = motionEvent.getPointerId(i3);
                                if ((bduuVar.v.getXVelocity(pointerId3) * xVelocity2) + (bduuVar.v.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                    bduuVar.v.clear();
                                    break;
                                }
                            }
                            i3++;
                        }
                    }
                } else if (!bduuVar.k) {
                    float f6 = bduuVar.q - f4;
                    float f7 = bduuVar.r - f5;
                    if (bduuVar.p) {
                        bduuVar.h.onDoubleTapEvent(motionEvent);
                    } else if (bduuVar.l) {
                        int i4 = (int) (f4 - bduuVar.s);
                        int i5 = (int) (f5 - bduuVar.t);
                        int i6 = (i4 * i4) + (i5 * i5);
                        if (i6 > bduuVar.a) {
                            bduuVar.g.onScroll(bduuVar.n, motionEvent, f6, f7);
                            bduuVar.q = f4;
                            bduuVar.r = f5;
                            bduuVar.l = false;
                            bduuVar.f.removeMessages(3);
                            bduuVar.f.removeMessages(1);
                            bduuVar.f.removeMessages(2);
                        }
                        if (i6 > bduuVar.a) {
                            bduuVar.m = false;
                        }
                    } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                        bduuVar.g.onScroll(bduuVar.n, motionEvent, f6, f7);
                        bduuVar.q = f4;
                        bduuVar.r = f5;
                    }
                }
                if (bduzVar.b && motionEvent.getAction() == 1) {
                    bduzVar.b = false;
                    bbyy bbyyVar = bduzVar.c.a;
                    if (bbyyVar.C().booleanValue()) {
                        bbyyVar.B();
                    }
                }
                return true;
            }
        };
        this.b = ggaVar;
        this.c = bbutVar;
        this.v = dxioVar;
        gga a = bbwoVar.a.a();
        bbwo.a(a, 1);
        bvrb a2 = bbwoVar.b.a();
        bbwo.a(a2, 2);
        bdup a3 = bbwoVar.c.a();
        bbwo.a(a3, 3);
        dxio a4 = ((dxjh) bbwoVar.d).a();
        bbwo.a(a4, 4);
        dxio a5 = ((dxjh) bbwoVar.e).a();
        bbwo.a(a5, 5);
        bbwo.a(bbtsVar, 6);
        bbwn bbwnVar = new bbwn(a, a2, a3, a4, a5, bbtsVar);
        this.h = bbwnVar;
        this.w = bbtkVar;
        this.d = bvrbVar;
        this.x = bbzfVar;
        this.H = bcpkVar;
        this.i = bcozVar;
        bbwnVar.m = new bbyi(this);
        bbwn bbwnVar2 = bbwnVar;
        bbwnVar2.n = 1;
        TextureView textureView = bbwnVar2.k;
        if (textureView != null) {
            bbwnVar2.d(textureView.getWidth(), bbwnVar2.k.getHeight());
        }
        bbwn bbwnVar3 = bbwnVar;
        bbwnVar3.i = new bbvu(16, 9);
        TextureView textureView2 = bbwnVar3.k;
        if (textureView2 != null) {
            bbwnVar3.d(textureView2.getWidth(), bbwnVar3.k.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z) {
        this.m = z;
        x();
    }

    private final int L() {
        dcdc<bbtm> m = this.j.m();
        int size = m.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.j.q(this.w.b(m.get(i2)))) {
                i++;
            }
        }
        return i;
    }

    private final boolean M(Uri uri) {
        String type = this.b.getContentResolver().getType(uri);
        if (type == null) {
            return false;
        }
        boolean startsWith = type.startsWith("image/");
        boolean startsWith2 = type.startsWith("video/");
        if (!startsWith && !startsWith2) {
            return false;
        }
        return C().booleanValue() || !startsWith2;
    }

    public static float w(int i, float f) {
        float f2 = f / i;
        return (f2 + f2) - 1.0f;
    }

    @dzsi
    public final bbtj A(Uri uri, int i, int i2, long j, @dzsi akqq akqqVar, dddn dddnVar) {
        float f = i / i2;
        bbtl w = bbtm.w(uri);
        ((bbse) w).a = Long.valueOf(j);
        w.q(Integer.valueOf(i));
        w.p(Integer.valueOf(i2));
        w.n(0);
        w.r(dddnVar);
        if (akqqVar != null) {
            w.i(akqqVar);
        }
        if (!u().booleanValue()) {
            x();
        }
        bbtj b = this.w.b(w.a());
        this.j.z(b);
        if (!this.j.B(b, f)) {
            return null;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        if (!this.n) {
            return;
        }
        this.a.e.Z(bvjk.gU, eapd.a().a);
        this.a.g(true);
        bbwi bbwiVar = this.h;
        bbyw bbywVar = new bbyw(this);
        bbwn bbwnVar = (bbwn) bbwiVar;
        if (bbwnVar.b()) {
            bbwnVar.f().j(bbywVar);
        }
        cqkx.p(this);
    }

    public Boolean C() {
        Camera.Parameters c;
        boolean z = false;
        if (this.B.a().b() && bdur.a(this.j.b) && (c = ((bbwn) this.h).c()) != null && c.getSupportedVideoSizes() != null && this.k.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void D(boolean z) {
        this.p = z;
    }

    public void E(ClipData clipData) {
        bbtj bbtjVar = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (M(uri)) {
                bbtjVar = A(uri, 1, 1, 0L, null, dddn.GMM_GALLERY);
            }
        }
        if (!u().booleanValue() || bbtjVar == null) {
            return;
        }
        G(bbtjVar);
    }

    public void F(Uri uri) {
        if (!M(uri)) {
            return;
        }
        bbtj A = A(uri, 1, 1, 0L, null, dddn.GMM_GALLERY);
        if (!u().booleanValue() || A == null) {
            return;
        }
        G(A);
    }

    public final void G(final bbtj bbtjVar) {
        final List<bbtm> l = dchl.l(this.j.m());
        final dehn<List<dwfl>> r2 = this.c.r(l);
        r2.Pk(new Runnable(this, r2, l, bbtjVar) { // from class: bbym
            private final bbyy a;
            private final dehn b;
            private final List c;
            private final bbtj d;

            {
                this.a = this;
                this.b = r2;
                this.c = l;
                this.d = bbtjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i;
                dbsg<bbtw> i2;
                bbyy bbyyVar = this.a;
                dehn dehnVar = this.b;
                List list = this.c;
                bbtj bbtjVar2 = this.d;
                try {
                    List list2 = (List) dehnVar.get();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= list.size()) {
                            i = 0;
                            break;
                        } else if (((bbtm) list.get(i3)).z().equals(bbtjVar2.a())) {
                            i = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    bbut bbutVar = bbyyVar.c;
                    ckni ckniVar = new ckni(list2, null, new bbto());
                    bbtv v = bbty.v();
                    if (bdur.b(bbyyVar.j.b)) {
                        i2 = dbpy.a;
                    } else {
                        i2 = bbyyVar.k.e().booleanValue() ? dbsg.i(bbtw.DONT_SEND_YET) : dbpy.a;
                    }
                    v.c(i2);
                    v.t(true);
                    v.i(false);
                    v.n(true);
                    v.f(true);
                    v.d(false);
                    v.e(false);
                    v.k(false);
                    v.q(bbtx.CONTROL_AUDIO_TRACK_PRESENCE_FOR_UPLOAD);
                    bbutVar.q(ckniVar, i, v.a(), bbyyVar.a, bbyyVar.k.g());
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }, this.d.h());
    }

    public void H(bbua bbuaVar) {
        dcdc<bbtm> m = this.j.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            bbtm bbtmVar = m.get(i);
            linkedHashMap.put(bbtmVar.A(), bbtmVar);
        }
        this.j.D();
        for (dwfl dwflVar : dchl.l(bbuaVar.a())) {
            String str = dwflVar.g;
            Uri parse = Uri.parse(dwflVar.h);
            bbtm bbtmVar2 = (bbtm) linkedHashMap.get(dwflVar.d);
            if (bbtmVar2 == null) {
                dpsn dpsnVar = dwflVar.t;
                if (dpsnVar == null) {
                    dpsnVar = dpsn.d;
                }
                akqi.j(dpsnVar).o();
                String str2 = dwflVar.d;
                String str3 = dwflVar.h;
            } else {
                bbtj s2 = this.j.s(this.w.b(bbtmVar2), parse, str);
                this.j.J(s2);
                this.j.u(s2, bbuaVar.b().contains(dwflVar));
            }
        }
        if (u().booleanValue()) {
            int f = bbuaVar.f();
            if (f == 0) {
                throw null;
            }
            if (f == 2) {
                gn gnVar = this.a.A;
                dbsk.s(gnVar);
                gnVar.e();
                g();
                return;
            }
            this.j.I();
            this.j.D();
            if (m.isEmpty() || m.get(0).d() != dddn.GMM_GALLERY) {
                return;
            }
            z();
        }
    }

    @Override // defpackage.bbyg
    public List<bbye> a() {
        dcdc<bbtm> m = this.j.m();
        m.size();
        dccx F = dcdc.F();
        for (bbtm bbtmVar : dchl.l(m)) {
            if (bbtmVar.d() == dddn.GMM_LIVE_CAMERA || bbtmVar.d() == dddn.GMM_GALLERY) {
                Uri z = bbtmVar.z();
                bbye bbyeVar = this.C.get(z);
                if (bbyeVar == null) {
                    this.j.K(bbtmVar);
                    final bbtj b = this.w.b(bbtmVar);
                    Runnable runnable = new Runnable(this, b) { // from class: bbyn
                        private final bbyy a;
                        private final bbtj b;

                        {
                            this.a = this;
                            this.b = b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.G(this.b);
                        }
                    };
                    Runnable runnable2 = new Runnable(this, b) { // from class: bbyo
                        private final bbyy a;
                        private final bbtj b;

                        {
                            this.a = this;
                            this.b = b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bbyy bbyyVar = this.a;
                            bbtj bbtjVar = this.b;
                            if (bbyyVar.j.q(bbtjVar)) {
                                bbyyVar.j.H(bbtjVar);
                            } else {
                                bbyyVar.j.z(bbtjVar);
                            }
                            cqkx.p(bbyyVar);
                        }
                    };
                    Runnable runnable3 = new Runnable(this, b) { // from class: bbyp
                        private final bbyy a;
                        private final bbtj b;

                        {
                            this.a = this;
                            this.b = b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            View aK;
                            bbyy bbyyVar = this.a;
                            bbtj bbtjVar = this.b;
                            bbyyVar.j.C(bbtjVar);
                            bbyyVar.j.H(bbtjVar);
                            if (bbyyVar.j.m().isEmpty()) {
                                View view = bbyyVar.a.P;
                                dbsk.s(view);
                                TransitionSet transitionSet = new TransitionSet();
                                transitionSet.setOrdering(1);
                                transitionSet.addTransition(new ChangeBounds());
                                transitionSet.addTransition(new Fade(1));
                                TransitionManager.beginDelayedTransition((ViewGroup) view, transitionSet);
                                RecyclerView recyclerView = (RecyclerView) cqkx.e(view, bbyf.c, RecyclerView.class);
                                if (recyclerView != null && (aK = recyclerView.l.aK(0)) != null) {
                                    recyclerView.l(abs.bm(aK));
                                }
                                for (bbye bbyeVar2 : bbyyVar.a()) {
                                    ((bbze) bbyeVar2).i(false);
                                    cqkx.p(bbyeVar2);
                                }
                                cqkx.p(bbyyVar);
                            }
                            bbyyVar.x();
                            bbyyVar.d.b(new bbyx(bbyyVar, bbtjVar.a()), bvrj.BACKGROUND_THREADPOOL);
                        }
                    };
                    bbzf bbzfVar = this.x;
                    bcan bcanVar = this.j;
                    bbzf.a(b, 1);
                    bbzf.a(this, 2);
                    bbzf.a(bcanVar, 4);
                    bbzf.a(runnable, 5);
                    bbzf.a(runnable2, 6);
                    bbzf.a(runnable3, 7);
                    gga a = bbzfVar.a.a();
                    bbzf.a(a, 8);
                    bbze bbzeVar = new bbze(b, this, bcanVar, runnable, runnable2, a);
                    bbzeVar.i(false);
                    this.C.put(z, bbzeVar);
                    bbyeVar = bbzeVar;
                }
                F.g(bbyeVar);
            }
        }
        return F.f();
    }

    @Override // defpackage.bbyg
    public CharSequence b() {
        int L = L();
        StringBuilder sb = new StringBuilder(11);
        sb.append(L);
        return sb.toString();
    }

    @Override // defpackage.bbyg
    public Boolean c() {
        return Boolean.valueOf(!this.j.m().isEmpty());
    }

    @Override // defpackage.bbyg
    public Boolean d() {
        return Boolean.valueOf(!this.m);
    }

    @Override // defpackage.bbyg
    public Boolean e() {
        return Boolean.valueOf(L() != 0);
    }

    @Override // defpackage.bbyg
    public String f() {
        return this.b.getResources().getString(true != C().booleanValue() ? R.string.TAKE_NEW_PHOTO : R.string.TAKE_A_PHOTO_OR_VIDEO);
    }

    @Override // defpackage.bbyg
    public cqkl g() {
        int i = this.k.i();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            bbwq bbwqVar = this.a;
            bbuy a = this.k.a();
            bbvd b = this.k.b();
            bcpk bcpkVar = this.H;
            bwrs<bcan> bwrsVar = this.A;
            aeui aeuiVar = aeui.b;
            bbuz m = bbve.m();
            bcan c = bwrsVar.c();
            dbsk.s(c);
            m.e(c.b);
            m.b(a);
            if (b != null) {
                ((bbsu) m).a = b;
            }
            bbwqVar.aZ(bdsd.i(m.a(), bcpc.SELECT_AND_UPLOAD, true, bwrsVar, bcpkVar.a, aeuiVar, null));
        } else if (i2 == 1) {
            gn gnVar = this.a.A;
            dbsk.s(gnVar);
            gnVar.e();
        } else {
            bvoo.h("Not all LiveCameraOption's NextButtonBehavior enums are handled by onClickNext!", new Object[0]);
        }
        return cqkl.a;
    }

    @Override // defpackage.bbyg
    public cqkl h() {
        gn gnVar = this.a.A;
        dbsk.s(gnVar);
        gnVar.e();
        return cqkl.a;
    }

    @Override // defpackage.bbyg
    public cqkl i() {
        if (this.m || this.n) {
            return cqkl.a;
        }
        K(true);
        long b = this.g.b();
        bbwi bbwiVar = this.h;
        bbyu bbyuVar = new bbyu(this, b);
        bbwn bbwnVar = (bbwn) bbwiVar;
        Camera camera = bbwnVar.h;
        if (camera != null) {
            if (!bbwnVar.b()) {
                bbwnVar.g(1);
                bbzd bbzdVar = (bbzd) bbwnVar.g;
                bduq bduqVar = bbwnVar.d;
                Rect c = bbzdVar.c();
                int width = c.width();
                int height = c.height();
                bbyuVar.a = width;
                bbyuVar.b = height;
                Camera.Parameters parameters = camera.getParameters();
                GmmLocation a = bbzdVar.f.a();
                if (a != null) {
                    parameters.setGpsAltitude(a.getAltitude());
                    parameters.setGpsLatitude(a.getLatitude());
                    parameters.setGpsLongitude(a.getLongitude());
                    parameters.setGpsTimestamp(a.getTime() / 1000);
                    parameters.setGpsProcessingMethod(a.getProvider());
                }
                parameters.setRotation(bbzdVar.c);
                camera.setParameters(parameters);
                GmmLocation a2 = bbzdVar.f.a();
                if (a2 != null) {
                    bbyuVar.c = new akqq(a2.getLatitude(), a2.getLongitude());
                }
                bbzdVar.e(camera, new bbza(bbzdVar, bbyuVar, bduqVar));
            } else {
                bvoo.h("Cannot take picture, currently recording a video.", new Object[0]);
            }
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bbyg
    public cqkl j() {
        B();
        return cqkl.a;
    }

    @Override // defpackage.bbyg
    public cqkl k() {
        final List<String> supportedFlashModes;
        List list = this.E;
        if (list == null) {
            Camera.Parameters c = ((bbwn) this.h).c();
            if (c == null) {
                supportedFlashModes = dcdc.e();
            } else {
                supportedFlashModes = c.getSupportedFlashModes();
                if (supportedFlashModes == null) {
                    supportedFlashModes = dcdc.e();
                }
            }
            dcbg b = dcbg.b(t);
            supportedFlashModes.getClass();
            list = b.o(new dbsl(supportedFlashModes) { // from class: bbyk
                private final List a;

                {
                    this.a = supportedFlashModes;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contains((String) obj);
                }
            }).z();
            this.E = list;
        }
        String s2 = s();
        if (list.isEmpty() || s2 == null) {
            return cqkl.a;
        }
        int indexOf = list.indexOf(s2);
        int size = indexOf >= 0 ? (indexOf + 1) % list.size() : 0;
        bbwi bbwiVar = this.h;
        String str = (String) list.get(size);
        bbwn bbwnVar = (bbwn) bbwiVar;
        Camera camera = bbwnVar.h;
        Camera.Parameters c2 = bbwnVar.c();
        if (camera != null && c2 != null) {
            c2.setFlashMode(str);
            camera.setParameters(c2);
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bbyg
    public cqkl l() {
        bvrj.UI_THREAD.c();
        if (this.a.I) {
            return cqkl.a;
        }
        if (this.y.a("android.permission.READ_EXTERNAL_STORAGE")) {
            z();
        } else {
            this.z.b("android.permission.READ_EXTERNAL_STORAGE", new axrw(this) { // from class: bbyl
                private final bbyy a;

                {
                    this.a = this;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    bbyy bbyyVar = this.a;
                    if (i == 0) {
                        bbyyVar.z();
                    }
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.bbyg
    public View.OnTouchListener m() {
        return this.D;
    }

    @Override // defpackage.bbyg
    public View.OnTouchListener n() {
        return this.F;
    }

    @Override // defpackage.bbyg
    public cqkn<bbyg> o() {
        return this.G;
    }

    @Override // defpackage.bbyg
    public Boolean p() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bbyg
    public Boolean q() {
        return Boolean.valueOf(this.h.b());
    }

    @Override // defpackage.bbyg
    public Integer r() {
        return Integer.valueOf(this.l);
    }

    @Override // defpackage.bbyg
    @dzsi
    public String s() {
        Camera.Parameters c = ((bbwn) this.h).c();
        if (c == null) {
            return null;
        }
        return c.getFlashMode();
    }

    @Override // defpackage.bbyg
    public String t() {
        int i;
        String s2 = s();
        if ("auto".equals(s2)) {
            i = R.string.FLASH_AUTO;
        } else {
            i = "on".equals(s2) ? R.string.FLASH_ON : R.string.FLASH_OFF;
        }
        return this.b.getResources().getString(i);
    }

    @Override // defpackage.bbyg
    public Boolean u() {
        boolean z = true;
        if (!bdur.b(this.j.b) && !this.k.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bbyg
    public Boolean v() {
        return this.k.d();
    }

    public final void x() {
        if (bvrj.UI_THREAD.b()) {
            cqkx.p(this);
        } else {
            this.d.b(new Runnable(this) { // from class: bbyj
                private final bbyy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqkx.p(this.a);
                }
            }, bvrj.UI_THREAD);
        }
    }

    public final void y() {
        if (bdur.b(this.j.b)) {
            this.j.I();
        }
    }

    public final void z() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        if (C().booleanValue()) {
            intent.setType("*/*");
        } else {
            intent.setType("image/*");
        }
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        PackageManager packageManager = this.b.getPackageManager();
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
            arrayList.add(resolveInfo.activityInfo.applicationInfo.packageName);
        }
        if (!arrayList.isEmpty()) {
            dcpd<String> it = u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (arrayList.contains(next)) {
                    intent.setPackage(next);
                    break;
                }
            }
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", !this.k.c().booleanValue());
        this.v.a().p(this.a, intent, awnn.PICK_PICTURE.ordinal(), 4);
    }
}
