package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: any  reason: default package */
/* loaded from: classes.dex */
public final class any implements ann {
    public final Object a = new Object();
    public Handler b;
    public HandlerThread c;
    public anz d;
    ano e;
    private final Context f;
    private final akv g;
    private ContentObserver h;
    private Runnable i;

    public any(Context context, akv akvVar) {
        hz.h(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = akvVar;
    }

    private final void b() {
        this.e = null;
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            this.f.getContentResolver().unregisterContentObserver(contentObserver);
            this.h = null;
        }
        synchronized (this.a) {
            this.b.removeCallbacks(this.i);
            HandlerThread handlerThread = this.c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.b = null;
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        long j;
        long j2;
        long min;
        if (this.e != null) {
            try {
                try {
                    alc a = aku.a(this.f, this.g, null);
                    if (a.a != 0) {
                        throw new RuntimeException("fetchFonts failed (" + a.a + ")");
                    }
                    ald[] aldVarArr = a.b;
                    if (aldVarArr == null || aldVarArr.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    ald aldVar = aldVarArr[0];
                    int i = aldVar.e;
                    if (i == 2) {
                        synchronized (this.a) {
                            anz anzVar = this.d;
                            if (anzVar != null) {
                                if (anzVar.b == 0) {
                                    anzVar.b = SystemClock.uptimeMillis();
                                    min = 0;
                                } else {
                                    long uptimeMillis = SystemClock.uptimeMillis() - anzVar.b;
                                    min = uptimeMillis > anzVar.a ? -1L : Math.min(Math.max(uptimeMillis, 1000L), anzVar.a - uptimeMillis);
                                }
                                if (min >= 0) {
                                    Uri uri = aldVar.a;
                                    synchronized (this.a) {
                                        if (this.h == null) {
                                            anw anwVar = new anw(this, this.b);
                                            this.h = anwVar;
                                            this.f.getContentResolver().registerContentObserver(uri, false, anwVar);
                                        }
                                        if (this.i == null) {
                                            this.i = new anx(this);
                                        }
                                        this.b.postDelayed(this.i, min);
                                    }
                                    return;
                                }
                            }
                            i = 2;
                        }
                    }
                    if (i == 0) {
                        Typeface b = akj.b(this.f, null, new ald[]{aldVar});
                        ByteBuffer p = iy.p(this.f, null, aldVar.a);
                        if (p != null) {
                            ano anoVar = this.e;
                            ByteBuffer duplicate = p.duplicate();
                            duplicate.order(ByteOrder.BIG_ENDIAN);
                            ib.j(4, duplicate);
                            char c = (char) duplicate.getShort();
                            if (c > 'd') {
                                throw new IOException("Cannot read metadata.");
                            }
                            ib.j(6, duplicate);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= c) {
                                    j = -1;
                                    j2 = -1;
                                    break;
                                }
                                int i3 = duplicate.getInt();
                                ib.j(4, duplicate);
                                j2 = ib.i(duplicate);
                                ib.j(4, duplicate);
                                if (i3 == 1835365473) {
                                    j = -1;
                                    break;
                                }
                                i2++;
                            }
                            if (j2 != j) {
                                ib.j((int) (j2 - duplicate.position()), duplicate);
                                ib.j(12, duplicate);
                                long i4 = ib.i(duplicate);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    int i6 = duplicate.getInt();
                                    long i7 = ib.i(duplicate);
                                    ib.i(duplicate);
                                    if (i6 != 1164798569 && i6 != 1701669481) {
                                    }
                                    duplicate.position((int) (i7 + j2));
                                    bmq bmqVar = new bmq();
                                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                    bmqVar.d(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                                    aoc aocVar = new aoc(b, bmqVar);
                                    ani aniVar = anoVar.a;
                                    aniVar.b = aocVar;
                                    aoc aocVar2 = aniVar.b;
                                    anp anpVar = aniVar.c;
                                    aniVar.a = new ant(aocVar2, anpVar.j, anpVar.h, anpVar.i);
                                    anp anpVar2 = aniVar.c;
                                    ArrayList arrayList = new ArrayList();
                                    anpVar2.a.writeLock().lock();
                                    anpVar2.c = 1;
                                    arrayList.addAll(anpVar2.b);
                                    anpVar2.b.clear();
                                    anpVar2.a.writeLock().unlock();
                                    anpVar2.d.post(new anm(arrayList, anpVar2.c));
                                    b();
                                    return;
                                }
                            }
                            throw new IOException("Cannot read metadata.");
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException("provider not found", e);
                }
            } catch (Throwable unused) {
                this.e.a.c.h();
                b();
            }
        }
    }
}
