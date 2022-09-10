package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.SurfaceView;
import com.google.ar.sceneform.animation.AnimationEngine;
import com.google.ar.sceneform.assets.Loader;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbcw  reason: default package */
/* loaded from: classes5.dex */
public class dbcw extends SurfaceView implements Choreographer.FrameCallback {
    public static final /* synthetic */ int h = 0;
    private final dbci a;
    private volatile boolean b;
    private boolean c;
    private dbep d;
    private AnimationEngine e;
    public dbhq f;
    public dbcs g;
    private dbcv i;

    public dbcw(Context context) {
        super(context);
        this.f = null;
        this.a = new dbci();
        this.b = false;
        this.c = false;
        this.i = dbct.a;
        b();
    }

    private final void b() {
        if (this.c) {
            return;
        }
        if (!dbix.c()) {
            this.f = null;
        } else {
            dbhq dbhqVar = new dbhq(this);
            this.f = dbhqVar;
            dbep dbepVar = this.d;
            if (dbepVar != null) {
                dbhqVar.a(dbepVar.d());
            }
            dbcs dbcsVar = new dbcs(this);
            this.g = dbcsVar;
            this.f.r = dbcsVar.a;
            try {
                if (Class.forName("dbdg") != null) {
                    this.e = AnimationEngine.a();
                    if (!Loader.a()) {
                        System.loadLibrary("sceneform_animation");
                    }
                    dbdg.a = true;
                    dbei.b = new dbdk();
                    dbef.b = new dbdh(AnimationEngine.a().c);
                    dbhx.b = new dbdm();
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        this.c = true;
    }

    protected boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0282 A[LOOP:7: B:98:0x027c->B:100:0x0282, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0298 A[LOOP:8: B:102:0x0292->B:104:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x046c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd A[LOOP:5: B:80:0x01f7->B:82:0x01fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219 A[LOOP:6: B:84:0x0213->B:86:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0240  */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r27) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbcw.doFrame(long):void");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        dbhq dbhqVar = this.f;
        dbjb.c(dbhqVar);
        int min = Math.min(i5, i6);
        int max = Math.max(i5, i6);
        if (min > 1080) {
            max = (max * 1080) / min;
            min = 1080;
        }
        int i7 = i5 < i6 ? min : max;
        if (i5 < i6) {
            min = max;
        }
        dbhqVar.o.setDesiredSize(i7, min);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dbcj dbcjVar;
        int i;
        boolean z;
        dbdc dbdcVar;
        boolean z2;
        dbdc dbdcVar2;
        dbdc dbdcVar3;
        dbdc dbdcVar4;
        if (!super.onTouchEvent(motionEvent)) {
            dbcs dbcsVar = this.g;
            dbjb.d(motionEvent, "Parameter \"motionEvent\" was null.");
            dbjb.d(motionEvent, "Parameter \"motionEvent\" was null.");
            dbch dbchVar = dbcsVar.a;
            if (dbchVar == null) {
                dbcjVar = new dbcj();
            } else {
                dbjb.d(motionEvent, "Parameter \"motionEvent\" was null.");
                int actionIndex = motionEvent.getActionIndex();
                dbdu c = dbchVar.c(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
                dbcj dbcjVar2 = new dbcj();
                dbds dbdsVar = dbcsVar.d;
                dbcjVar2.b = Float.MAX_VALUE;
                dbcjVar2.c.b(0.0f, 0.0f, 0.0f);
                dbcjVar2.a = null;
                dbdv dbdvVar = new dbdv();
                ArrayList<dbdq> arrayList = dbdsVar.a;
                int size = arrayList.size();
                dbdq dbdqVar = null;
                for (int i2 = 0; i2 < size; i2++) {
                    dbdq dbdqVar2 = arrayList.get(i2);
                    dbdr dbdrVar = dbdqVar2.b;
                    if (dbdrVar != null && (dbdrVar.a.b(dbdqVar2.e) || dbdqVar2.d || dbdqVar2.c == null)) {
                        dbdr dbdrVar2 = dbdqVar2.c;
                        if (dbdrVar2 == null) {
                            dbdqVar2.c = dbdqVar2.b.g(dbdqVar2.a);
                        } else {
                            dbdqVar2.b.h(dbdqVar2.a, dbdrVar2);
                        }
                        dbdqVar2.e = dbdqVar2.b.a.a;
                    }
                    dbdr dbdrVar3 = dbdqVar2.c;
                    if (dbdrVar3 != null && dbdrVar3.f(c, dbdvVar)) {
                        float f = dbdvVar.b;
                        if (f < dbcjVar2.b) {
                            dbcjVar2.b = f;
                            dbcjVar2.a(dbdvVar.c);
                            dbdqVar = dbdqVar2;
                        }
                    }
                }
                if (dbdqVar != null) {
                    dbcjVar2.a = (dbcm) dbdqVar.a;
                }
                dbcjVar = dbcjVar2;
            }
            dbdd dbddVar = dbcsVar.e;
            dbjb.d(motionEvent, "Parameter \"motionEvent\" was null.");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                dbddVar.c();
                i = 0;
            } else {
                i = actionMasked;
            }
            ArrayList<dbcr> arrayList2 = dbddVar.a;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.get(i3).a();
            }
            dbcm dbcmVar = dbcjVar.a;
            if (i == 0 || i == 5) {
                int pointerId = 1 << motionEvent.getPointerId(motionEvent.getActionIndex());
                dbddVar.a(pointerId);
                if (dbcmVar != null) {
                    dbdc dbdcVar5 = dbddVar.b;
                    while (true) {
                        if (dbdcVar5 == null) {
                            dbdcVar4 = null;
                            break;
                        } else if (dbdcVar5.a == dbcmVar) {
                            dbdcVar4 = dbdcVar5;
                            break;
                        } else {
                            dbdcVar5 = dbdcVar5.c;
                        }
                    }
                    if (dbdcVar4 != null) {
                        dbdcVar4.b |= pointerId;
                        dbdcVar = dbdcVar4;
                        z = false;
                    } else {
                        dbcm b = dbddVar.b(motionEvent, dbcjVar, dbcmVar, pointerId, true);
                        if (b != null) {
                            dbdc dbdcVar6 = new dbdc();
                            dbdcVar6.a = b;
                            dbdcVar6.b = pointerId;
                            dbdcVar6.c = dbddVar.b;
                            dbddVar.b = dbdcVar6;
                            dbdcVar = dbdcVar6;
                            z2 = true;
                        } else {
                            dbdcVar = dbdcVar4;
                            z2 = false;
                        }
                        z = true;
                        if (dbdcVar == null && (dbdcVar3 = dbddVar.b) != null) {
                            do {
                                dbdcVar = dbdcVar3;
                                dbdcVar3 = dbdcVar.c;
                            } while (dbdcVar3 != null);
                            dbdcVar.b |= pointerId;
                        }
                        dbdcVar2 = dbdcVar;
                    }
                } else {
                    z = false;
                    dbdcVar = null;
                }
                z2 = false;
                if (dbdcVar == null) {
                    do {
                        dbdcVar = dbdcVar3;
                        dbdcVar3 = dbdcVar.c;
                    } while (dbdcVar3 != null);
                    dbdcVar.b |= pointerId;
                }
                dbdcVar2 = dbdcVar;
            } else {
                z = false;
                dbdcVar2 = null;
                z2 = false;
            }
            dbdc dbdcVar7 = dbddVar.b;
            if (dbdcVar7 != null) {
                while (dbdcVar7 != null) {
                    dbdc dbdcVar8 = dbdcVar7.c;
                    if (!z2 || dbdcVar7 != dbdcVar2) {
                        dbddVar.b(motionEvent, dbcjVar, dbdcVar7.a, dbdcVar7.b, false);
                    }
                    dbdcVar7 = dbdcVar8;
                }
            } else if (!z) {
                motionEvent.getActionMasked();
            }
            if (i == 3 || i == 1) {
                dbddVar.c();
            } else if (i == 6) {
                dbddVar.a(1 << motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return true;
        }
        return true;
    }

    public void setAnimationTimeTransformer(dbcv dbcvVar) {
        this.i = dbcvVar;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            dbep dbepVar = new dbep(((ColorDrawable) drawable).getColor());
            this.d = dbepVar;
            dbhq dbhqVar = this.f;
            if (dbhqVar == null) {
                return;
            }
            dbhqVar.a(dbepVar.d());
            return;
        }
        this.d = null;
        dbhq dbhqVar2 = this.f;
        if (dbhqVar2 != null) {
            dbhqVar2.b();
        }
        super.setBackground(drawable);
    }

    public dbcw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = null;
        this.a = new dbci();
        this.b = false;
        this.c = false;
        this.i = dbcu.a;
        b();
    }
}
