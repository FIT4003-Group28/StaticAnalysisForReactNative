package defpackage;

import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbdd  reason: default package */
/* loaded from: classes5.dex */
public final class dbdd {
    private Method c;
    private final Object[] d = new Object[1];
    public final ArrayList<dbcr> a = new ArrayList<>();
    public dbdc b = null;

    private final MotionEvent d(MotionEvent motionEvent, int i) {
        if (this.c == null) {
            try {
                this.c = MotionEvent.class.getMethod("split", Integer.TYPE);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Splitting MotionEvent not supported.", e);
            }
        }
        try {
            this.d[0] = Integer.valueOf(i);
            Object invoke = this.c.invoke(motionEvent, this.d);
            return invoke != null ? (MotionEvent) invoke : motionEvent;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException("Unable to split MotionEvent.", e2);
        }
    }

    public final void a(int i) {
        dbdc dbdcVar = this.b;
        dbdc dbdcVar2 = null;
        while (dbdcVar != null) {
            dbdc dbdcVar3 = dbdcVar.c;
            int i2 = dbdcVar.b;
            if ((i2 & i) != 0) {
                int i3 = i2 & (i ^ (-1));
                dbdcVar.b = i3;
                if (i3 == 0) {
                    if (dbdcVar2 == null) {
                        this.b = dbdcVar3;
                    } else {
                        dbdcVar2.c = dbdcVar3;
                    }
                    dbdcVar = dbdcVar3;
                }
            }
            dbdcVar2 = dbdcVar;
            dbdcVar = dbdcVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
        if (r2.n == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a2, code lost:
        if (r3 != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a4, code lost:
        r1 = r2.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a6, code lost:
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a8, code lost:
        r1.a.callOnClick();
        r2.u = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbcm b(android.view.MotionEvent r28, defpackage.dbcj r29, defpackage.dbcm r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbdd.b(android.view.MotionEvent, dbcj, dbcm, int, boolean):dbcm");
    }

    public final void c() {
        this.b = null;
    }
}
