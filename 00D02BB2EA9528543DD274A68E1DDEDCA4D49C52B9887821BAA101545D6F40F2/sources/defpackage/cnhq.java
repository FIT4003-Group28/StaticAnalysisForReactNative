package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cnhq  reason: default package */
/* loaded from: classes.dex */
public final class cnhq extends cmxx {
    private final WeakReference<cnht> a;

    public cnhq(cnht cnhtVar) {
        this.a = new WeakReference<>(cnhtVar);
    }

    private final void B(final InputFocusChangedEvent inputFocusChangedEvent) {
        final cnht cnhtVar = this.a.get();
        cmyz.a(new Runnable(cnhtVar, inputFocusChangedEvent) { // from class: cnha
            private final cnht a;
            private final InputFocusChangedEvent b;

            {
                this.a = cnhtVar;
                this.b = inputFocusChangedEvent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                InputFocusChangedEvent inputFocusChangedEvent2 = this.b;
                if (cnjc.a("CAR.PROJECTION.CAHI", 2)) {
                    SparseArray<String> sparseArray = cnht.G;
                    String str = cnhtVar2.u;
                }
                SparseArray<String> sparseArray2 = cnht.G;
                cnhtVar2.i(inputFocusChangedEvent2, true);
            }
        });
    }

    private static String C() {
        StackTraceElement[] value;
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StringBuilder sb = new StringBuilder("***ANR Stack Traces***");
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            sb.append(entry.getKey().toString());
            sb.append(":");
            if (entry.getValue().length == 0) {
                sb.append(" No non-native stack");
            } else {
                for (StackTraceElement stackTraceElement : entry.getValue()) {
                    sb.append("\n\t");
                    sb.append(stackTraceElement.toString());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static boolean D(cnht cnhtVar) {
        return cnhtVar == null || cnhtVar.f == null;
    }

    @Override // defpackage.cmxy
    public final void A(cmxz cmxzVar) {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        String C = C();
        int i2 = cnjc.a;
        Bundle bundle = new Bundle();
        bundle.putString("anr_logs", C);
        try {
            cmxzVar.w(bundle);
        } catch (RemoteException unused) {
        }
        SparseArray<String> sparseArray2 = cnht.G;
        if (!cnhtVar.B) {
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    @Override // defpackage.cmxy
    @Deprecated
    public final void b(final int i, final DrawingSpec drawingSpec, final Intent intent, final Bundle bundle) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i2 = cnjc.a;
        }
        SparseArray<String> sparseArray2 = cnht.G;
        cnhtVar.n();
        cmyz.a(new Runnable(cnhtVar, i, drawingSpec, intent, bundle) { // from class: cngx
            private final cnht a;
            private final int b;
            private final DrawingSpec c;
            private final Intent d;
            private final Bundle e;

            {
                this.a = cnhtVar;
                this.b = i;
                this.c = drawingSpec;
                this.d = intent;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                int i3 = this.b;
                DrawingSpec drawingSpec2 = this.c;
                Intent intent2 = this.d;
                Bundle bundle2 = this.e;
                CarRegionId a = CarRegionId.a(new CarDisplayId(i3));
                SparseArray<String> sparseArray3 = cnht.G;
                cnhtVar2.g(a, drawingSpec2, intent2, null, bundle2);
            }
        });
    }

    @Override // defpackage.cmxy
    public final void c(final Intent intent) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        cmyz.a(new Runnable(cnhtVar, intent) { // from class: cnhj
            private final cnht a;
            private final Intent b;

            {
                this.a = cnhtVar;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                cnht cnhtVar2 = this.a;
                Intent intent2 = this.b;
                SparseArray<String> sparseArray2 = cnht.G;
                if (cnhtVar2.f() && cnhtVar2.i != null) {
                    if (cnhtVar2.H == 5) {
                        cnhtVar2.o(4);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cnhtVar2.H == 4 || cnhtVar2.H == 3) {
                        cnhtVar2.i.v(intent2);
                    } else {
                        cnht.G.get(cnhtVar2.H);
                        int i2 = cnjc.a;
                    }
                    if (z) {
                        cnhtVar2.o(5);
                    }
                    try {
                        cnhtVar2.J.f();
                    } catch (RemoteException unused) {
                        cnhtVar2.r();
                    }
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void d(int i, final MotionEvent motionEvent) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i2 = cnjc.a;
        }
        if (motionEvent.isFromSource(4098)) {
            cmyz.a(new Runnable(cnhtVar, motionEvent) { // from class: cnhp
                private final cnht a;
                private final MotionEvent b;

                {
                    this.a = cnhtVar;
                    this.b = motionEvent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cnht cnhtVar2 = this.a;
                    if (cnjc.a("CAR.PROJECTION.CAHI", 2)) {
                        SparseArray<String> sparseArray2 = cnht.G;
                        String str2 = cnhtVar2.u;
                        cmvt cmvtVar = cnhtVar2.i;
                        cnhtVar2.c();
                    }
                    if (cnhtVar2.i == null || cnhtVar2.c()) {
                        return;
                    }
                    cnhtVar2.i(new InputFocusChangedEvent(true, true, -1, null), false);
                }
            });
            try {
                SparseArray<String> sparseArray2 = cnht.G;
                synchronized (cnhtVar.D) {
                    if (cnjc.a("CAR.PROJECTION.CAHI", 2)) {
                        SystemClock.elapsedRealtime();
                        String str2 = cnhtVar.u;
                        boolean z = cnhtVar.E;
                    }
                    while (!cnhtVar.E) {
                        cnhtVar.D.wait(500L);
                    }
                    if (cnjc.a("CAR.PROJECTION.CAHI", 2)) {
                        SystemClock.elapsedRealtime();
                        String str3 = cnhtVar.u;
                        boolean z2 = cnhtVar.E;
                    }
                }
            } catch (InterruptedException unused) {
                int i3 = cnjc.a;
            }
        }
        cmyz.a(new Runnable(cnhtVar, motionEvent) { // from class: cngy
            private final cnht a;
            private final MotionEvent b;

            {
                this.a = cnhtVar;
                this.b = motionEvent;
            }

            /* JADX WARN: Code restructure failed: missing block: B:185:0x02e2, code lost:
                if (r9.a == r14) goto L187;
             */
            /* JADX WARN: Code restructure failed: missing block: B:198:0x031e, code lost:
                if (r12.p != false) goto L199;
             */
            /* JADX WARN: Removed duplicated region for block: B:237:0x03f3  */
            /* JADX WARN: Removed duplicated region for block: B:251:0x0440  */
            /* JADX WARN: Removed duplicated region for block: B:256:0x0456  */
            /* JADX WARN: Removed duplicated region for block: B:258:0x0459 A[Catch: RemoteException -> 0x0453, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0453, blocks: (B:254:0x0450, B:258:0x0459), top: B:267:0x0450 }] */
            /* JADX WARN: Removed duplicated region for block: B:260:0x045c  */
            /* JADX WARN: Removed duplicated region for block: B:267:0x0450 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1134
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cngy.run():void");
            }
        });
    }

    @Override // defpackage.cmxy
    @Deprecated
    public final void e(boolean z) {
        if (D(this.a.get())) {
            int i = cnjc.a;
            return;
        }
        if (cnjc.a("CAR.PROJECTION.CAHI", 2)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = this.a.get().u;
        }
        B(new InputFocusChangedEvent(z, true, -1, null));
    }

    @Override // defpackage.cmxy
    public final void f() {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        C();
        int i2 = cnjc.a;
        SparseArray<String> sparseArray2 = cnht.G;
        if (!cnhtVar.B) {
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    @Override // defpackage.cmxy
    public final void g() {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        SparseArray<String> sparseArray = cnht.G;
        cnin cninVar = cnhtVar.v;
        if (cninVar == null) {
            return;
        }
        if (cmwk.a("CAR.INPUT", 3)) {
            int i = cnjc.a;
        }
        synchronized (cninVar.b) {
            if (!cninVar.b.isEmpty()) {
                cninVar.b.poll();
            } else {
                int i2 = cnjc.a;
            }
        }
    }

    @Override // defpackage.cmxy
    public final void h() {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cnhtVar.e();
    }

    @Override // defpackage.cmxy
    public final void i() {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        SparseArray<String> sparseArray = cnht.G;
        cnaa cnaaVar = cnhtVar.k;
        if (cnaaVar == null) {
            return;
        }
        cnaaVar.b(null);
    }

    @Override // defpackage.cmxy
    public final void j(final int i) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cmyz.a(new Runnable(cnhtVar, i) { // from class: cnhd
            private final cnht a;
            private final int b;

            {
                this.a = cnhtVar;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                int i2 = this.b;
                SparseArray<String> sparseArray = cnht.G;
                cmvt cmvtVar = cnhtVar2.i;
                if (cmvtVar != null) {
                    cmvtVar.w(i2);
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void k(final int i) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cmyz.a(new Runnable(cnhtVar, i) { // from class: cnhf
            private final cnht a;
            private final int b;

            {
                this.a = cnhtVar;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SparseArray<String> sparseArray = cnht.G;
            }
        });
    }

    @Override // defpackage.cmxy
    public final void l(final DrawingSpec drawingSpec) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cmyz.a(new Runnable(cnhtVar, drawingSpec) { // from class: cnhc
            private final cnht a;
            private final DrawingSpec b;

            {
                this.a = cnhtVar;
                this.b = drawingSpec;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                DrawingSpec drawingSpec2 = this.b;
                SparseArray<String> sparseArray = cnht.G;
                if (cnhtVar2.i == null) {
                    if (!cmwk.a("CAR.PROJECTION.CAHI", 3)) {
                        return;
                    }
                    int i = cnjc.a;
                    return;
                }
                cnaa cnaaVar = cnhtVar2.k;
                if (cnaaVar == null) {
                    cnhtVar2.k(drawingSpec2.a, drawingSpec2.b, drawingSpec2.c, drawingSpec2.d);
                } else {
                    cnaaVar.b(drawingSpec2.d);
                }
                cnhtVar2.l(drawingSpec2);
                cnhtVar2.a(cnhtVar2.t);
                try {
                    cnhtVar2.J.t();
                } catch (RemoteException unused) {
                    cmyz.a(cnhtVar2.d);
                }
            }
        });
    }

    @Override // defpackage.cmxy
    @Deprecated
    public final void m(boolean z, boolean z2) {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            int i = cnjc.a;
            return;
        }
        if (cnjc.a("CAR.PROJECTION.CAHI", 2)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
        }
        B(new InputFocusChangedEvent(z, !z2, -1, null));
    }

    @Override // defpackage.cmxy
    public final void n(final IBinder iBinder) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        cmyz.a(new Runnable(cnhtVar, iBinder) { // from class: cnhe
            private final cnht a;
            private final IBinder b;

            {
                this.a = cnhtVar;
                this.b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                IBinder iBinder2 = this.b;
                SparseArray<String> sparseArray2 = cnht.G;
                cmvt cmvtVar = cnhtVar2.i;
                if (cmvtVar != null) {
                    cmvtVar.Oh(iBinder2);
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void o(InputFocusChangedEvent inputFocusChangedEvent) {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            int i = cnjc.a;
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i2 = cnjc.a;
        }
        B(inputFocusChangedEvent);
    }

    @Override // defpackage.cmxy
    public final void p(final CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cmyz.a(new Runnable(cnhtVar, carWindowManagerLayoutParams) { // from class: cnhb
            private final cnht a;
            private final CarWindowManagerLayoutParams b;

            {
                this.a = cnhtVar;
                this.b = carWindowManagerLayoutParams;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                CarWindowManagerLayoutParams carWindowManagerLayoutParams2 = this.b;
                SparseArray<String> sparseArray = cnht.G;
                cmyy cmyyVar = cnhtVar2.l;
                if (cmyyVar != null) {
                    int i = carWindowManagerLayoutParams2.a;
                    if (!cmyyVar.t) {
                        return;
                    }
                    cniv cnivVar = cmyyVar.g;
                    cnivVar.e = i;
                    if (cnivVar.a == null || cnivVar.b == null || cnivVar.c == null || cnivVar.d == null) {
                        if (!cmwk.a("CAR.PROJECTION", 3)) {
                            return;
                        }
                        int i2 = cnjc.a;
                        return;
                    }
                    cnivVar.d();
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void q(final Rect rect) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            int i = cnjc.a;
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i2 = cnjc.a;
        }
        SparseArray<String> sparseArray2 = cnht.G;
        cnhtVar.n();
        cmyz.a(new Runnable(cnhtVar, rect) { // from class: cnho
            private final cnht a;
            private final Rect b;

            {
                this.a = cnhtVar;
                this.b = rect;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                Rect rect2 = this.b;
                SparseArray<String> sparseArray3 = cnht.G;
                cnhtVar2.x.set(rect2);
                cmyy cmyyVar = cnhtVar2.l;
                if (cmyyVar != null) {
                    Rect rect3 = cnhtVar2.x;
                    if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                        int i3 = cnjc.a;
                    }
                    cmyyVar.a(rect3);
                    View view = cmyyVar.a;
                    if (view == null) {
                        return;
                    }
                    view.requestApplyInsets();
                    return;
                }
                int i4 = cnjc.a;
            }
        });
    }

    @Override // defpackage.cmxy
    public final void r(final int i, final DrawingSpec drawingSpec, final Intent intent, final Configuration configuration, final Bundle bundle) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i2 = cnjc.a;
        }
        SparseArray<String> sparseArray2 = cnht.G;
        cnhtVar.n();
        cmyz.a(new Runnable(cnhtVar, i, drawingSpec, intent, configuration, bundle) { // from class: cnhh
            private final cnht a;
            private final int b;
            private final DrawingSpec c;
            private final Intent d;
            private final Configuration e;
            private final Bundle f;

            {
                this.a = cnhtVar;
                this.b = i;
                this.c = drawingSpec;
                this.d = intent;
                this.e = configuration;
                this.f = bundle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                int i3 = this.b;
                DrawingSpec drawingSpec2 = this.c;
                Intent intent2 = this.d;
                Configuration configuration2 = this.e;
                Bundle bundle2 = this.f;
                CarRegionId a = CarRegionId.a(new CarDisplayId(i3));
                SparseArray<String> sparseArray3 = cnht.G;
                cnhtVar2.g(a, drawingSpec2, intent2, configuration2, bundle2);
            }
        });
    }

    @Override // defpackage.cmxy
    public final void s() {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cnhtVar.getClass();
        cmyz.a(new Runnable(cnhtVar) { // from class: cnhg
            private final cnht a;

            {
                this.a = cnhtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                SparseArray<String> sparseArray = cnht.G;
                View view = cnhtVar2.t;
                if (view != null) {
                    view.invalidate();
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void t(final int i, final int i2, final DrawingSpec drawingSpec, final Intent intent, final Configuration configuration, final Bundle bundle) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i3 = cnjc.a;
        }
        SparseArray<String> sparseArray2 = cnht.G;
        cnhtVar.n();
        cmyz.a(new Runnable(cnhtVar, i2, i, drawingSpec, intent, configuration, bundle) { // from class: cnhi
            private final cnht a;
            private final int b;
            private final int c;
            private final DrawingSpec d;
            private final Intent e;
            private final Configuration f;
            private final Bundle g;

            {
                this.a = cnhtVar;
                this.b = i2;
                this.c = i;
                this.d = drawingSpec;
                this.e = intent;
                this.f = configuration;
                this.g = bundle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                int i4 = this.b;
                int i5 = this.c;
                DrawingSpec drawingSpec2 = this.d;
                Intent intent2 = this.e;
                Configuration configuration2 = this.f;
                Bundle bundle2 = this.g;
                CarRegionId carRegionId = new CarRegionId(i4, new CarDisplayId(i5));
                SparseArray<String> sparseArray3 = cnht.G;
                cnhtVar2.g(carRegionId, drawingSpec2, intent2, configuration2, bundle2);
            }
        });
    }

    @Override // defpackage.cmxy
    public final void u(final KeyEvent keyEvent) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        cmyz.a(new Runnable(cnhtVar, keyEvent) { // from class: cngz
            private final cnht a;
            private final KeyEvent b;

            {
                this.a = cnhtVar;
                this.b = keyEvent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cmyy cmyyVar;
                cnht cnhtVar2 = this.a;
                KeyEvent keyEvent2 = this.b;
                if (cnhtVar2.i != null) {
                    if (cnhtVar2.f() && (cmyyVar = cnhtVar2.l) != null) {
                        if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                            cmyyVar.isShowing();
                            int i = cnjc.a;
                        }
                        if (cmyyVar.t) {
                            cmyyVar.n = false;
                        }
                        if (cmyyVar.isShowing() && cmyyVar.f && cmyyVar.m) {
                            cmyyVar.n(true, false);
                            cmyyVar.c().injectInputEvent(keyEvent2);
                            cmvv cmvvVar = cnhtVar2.w;
                            return;
                        }
                    }
                    if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
                        keyEvent2.getKeyCode();
                        keyEvent2.getAction();
                        int i2 = cnjc.a;
                    }
                    try {
                        cnhtVar2.J.k(false);
                    } catch (RemoteException unused) {
                        cnhtVar2.r();
                    }
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void v() {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        cnhtVar.getClass();
        cmyz.a(new Runnable(cnhtVar) { // from class: cnhm
            private final cnht a;

            {
                this.a = cnhtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                SparseArray<String> sparseArray2 = cnht.G;
                if (!cnhtVar2.f()) {
                    return;
                }
                if (cnhtVar2.i != null && (cnhtVar2.H == 3 || cnhtVar2.H == 5)) {
                    cnhtVar2.o(4);
                }
                try {
                    cnhtVar2.J.j();
                } catch (RemoteException unused) {
                    cnhtVar2.r();
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void w() {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        cnhtVar.getClass();
        cmyz.a(new Runnable(cnhtVar) { // from class: cnhl
            private final cnht a;

            {
                this.a = cnhtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                SparseArray<String> sparseArray2 = cnht.G;
                if (!cnhtVar2.f()) {
                    return;
                }
                cnhtVar2.o(5);
                try {
                    cnhtVar2.J.h();
                } catch (RemoteException unused) {
                    cnhtVar2.r();
                }
            }
        });
    }

    @Override // defpackage.cmxy
    public final void x() {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        cnhtVar.getClass();
        cmyz.a(new Runnable(cnhtVar) { // from class: cnhk
            private final cnht a;

            {
                this.a = cnhtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cnht cnhtVar2 = this.a;
                SparseArray<String> sparseArray2 = cnht.G;
                if (!cnhtVar2.f()) {
                    return;
                }
                cnhtVar2.o(2);
                cnaa cnaaVar = cnhtVar2.k;
                if (cnaaVar != null) {
                    cnaaVar.b(null);
                }
                try {
                    cnhtVar2.J.g();
                } catch (RemoteException unused) {
                    cnhtVar2.r();
                }
                cmyy cmyyVar = cnhtVar2.l;
                if (cmyyVar == null) {
                    return;
                }
                cmyyVar.hide();
            }
        });
    }

    @Override // defpackage.cmxy
    public final void y(final int i, final DrawingSpec drawingSpec, final Configuration configuration) {
        final cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i2 = cnjc.a;
        }
        SparseArray<String> sparseArray2 = cnht.G;
        cnhtVar.n();
        cmyz.a(new Runnable(cnhtVar, i, drawingSpec, configuration) { // from class: cnhn
            private final cnht a;
            private final int b;
            private final DrawingSpec c;
            private final Configuration d;

            {
                this.a = cnhtVar;
                this.b = i;
                this.c = drawingSpec;
                this.d = configuration;
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 388
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cnhn.run():void");
            }
        });
    }

    @Override // defpackage.cmxy
    public final void z(cmxz cmxzVar, cmxn cmxnVar) {
        cnht cnhtVar = this.a.get();
        if (D(cnhtVar)) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray<String> sparseArray = cnht.G;
            String str = cnhtVar.u;
            int i = cnjc.a;
        }
        SparseArray<String> sparseArray2 = cnht.G;
        cnhtVar.y.t(cmxnVar);
        synchronized (cnhtVar.e) {
            cnhtVar.J = cmxzVar;
            try {
                cmxzVar.asBinder().linkToDeath(cnhtVar.e, 0);
            } catch (RemoteException unused) {
                cnhtVar.J = null;
                cmyz.a(cnhtVar.d);
                return;
            }
        }
        try {
            cmxzVar.x();
        } catch (RemoteException unused2) {
            cmyz.a(cnhtVar.d);
        }
    }
}
