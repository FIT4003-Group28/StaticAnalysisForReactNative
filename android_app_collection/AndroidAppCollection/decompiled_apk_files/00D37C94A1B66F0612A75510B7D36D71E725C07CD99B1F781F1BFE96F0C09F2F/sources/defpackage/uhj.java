package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: uhj  reason: default package */
/* loaded from: classes4.dex */
public final class uhj {
    public final Context a;
    public final uhm b;
    public final uhe c;
    public final uck d;
    private final uex e;
    private final axnm f;
    private final ues g;

    public uhj(Context context, ucj ucjVar, uex uexVar, uhm uhmVar, axnm axnmVar, uhe uheVar, ues uesVar) {
        this.a = context;
        this.e = uexVar;
        this.b = uhmVar;
        this.f = axnmVar;
        this.c = uheVar;
        this.g = uesVar;
        this.d = ucjVar.d;
    }

    public static List d(List list, ubz ubzVar) {
        ArrayList arrayList = new ArrayList();
        if (ubzVar.d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Bitmap bitmap = (Bitmap) ((Future) it.next()).get();
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (InterruptedException e) {
                    uev.c("NotificationBuilderHelper", e, "Failed to download image", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                    e = e2;
                    uev.c("NotificationBuilderHelper", e, "Failed to download image.", new Object[0]);
                } catch (ExecutionException e3) {
                    e = e3;
                    uev.c("NotificationBuilderHelper", e, "Failed to download image.", new Object[0]);
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Bitmap bitmap2 = (Bitmap) ((Future) it2.next()).get(ubzVar.a(), TimeUnit.MILLISECONDS);
                    if (bitmap2 != null) {
                        arrayList.add(bitmap2);
                    }
                } catch (InterruptedException e4) {
                    uev.c("NotificationBuilderHelper", e4, "Failed to download image, remaining time: %d ms.", Long.valueOf(ubzVar.a()));
                    Thread.currentThread().interrupt();
                } catch (CancellationException e5) {
                    e = e5;
                    uev.c("NotificationBuilderHelper", e, "Failed to download image, remaining time: %d ms.", Long.valueOf(ubzVar.a()));
                } catch (ExecutionException e6) {
                    e = e6;
                    uev.c("NotificationBuilderHelper", e, "Failed to download image, remaining time: %d ms.", Long.valueOf(ubzVar.a()));
                } catch (TimeoutException e7) {
                    e = e7;
                    uev.c("NotificationBuilderHelper", e, "Failed to download image, remaining time: %d ms.", Long.valueOf(ubzVar.a()));
                }
            }
        }
        return arrayList;
    }

    public static int g(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            if (i2 == 3) {
                return 2;
            }
            return i2 != 4 ? 0 : -2;
        }
        return 1;
    }

    private final Bitmap i(aolz aolzVar, List list) {
        if (!list.isEmpty()) {
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
            int M = akel.M(aolzVar.s);
            if (M == 0) {
                M = 1;
            }
            if (M - 1 != 2) {
                return this.e.a(dimensionPixelSize, list);
            }
            return this.e.b(dimensionPixelSize, list);
        }
        return null;
    }

    private static final CharSequence j(String str) {
        return axqq.b() ? hy.r(str) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(java.lang.String r19, defpackage.ucp r20, defpackage.ucw r21, boolean r22, defpackage.ubz r23, defpackage.uip r24) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhj.a(java.lang.String, ucp, ucw, boolean, ubz, uip):android.util.Pair");
    }

    public final CharSequence b(int i, String... strArr) {
        if (!axqq.b()) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = Html.escapeHtml(strArr[i2]);
            }
        }
        return hy.r(this.a.getString(i, strArr));
    }

    public final String c(ucp ucpVar, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            aolz aolzVar = ((ucw) it.next()).d;
            if ((aolzVar.b & 131072) != 0) {
                hashSet.add(aolzVar.u);
            } else {
                i++;
            }
        }
        if (hashSet.size() != 1 || i != 0) {
            if (ucpVar != null && this.d.g) {
                return ucpVar.b;
            }
            return null;
        }
        return (String) hashSet.iterator().next();
    }

    public final void e(fi fiVar, ucp ucpVar, int i) {
        String string = this.a.getString(this.d.b.intValue());
        String quantityString = this.a.getResources().getQuantityString(R.plurals.public_notification_text, i, Integer.valueOf(i));
        fi fiVar2 = new fi(this.a);
        fiVar2.k(string);
        fiVar2.j(quantityString);
        fiVar2.r(this.d.a.intValue());
        if (ucpVar != null) {
            fiVar2.t(ucpVar.b);
        }
        if (this.d.c != null) {
            fiVar2.z = this.a.getResources().getColor(this.d.c.intValue());
        }
        fiVar.B = fiVar2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.fi r3, defpackage.aolz r4, boolean r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L14
            uck r0 = r2.d
            boolean r0 = r0.e
            if (r0 == 0) goto L14
            aolx r0 = r4.k
            if (r0 != 0) goto Le
            aolx r0 = defpackage.aolx.a
        Le:
            boolean r0 = r0.c
            if (r0 != 0) goto L14
            r0 = 2
            goto L19
        L14:
            r0 = 0
            r3.v(r0)
            r0 = 0
        L19:
            if (r5 != 0) goto L2d
            uck r1 = r2.d
            boolean r1 = r1.d
            if (r1 == 0) goto L2d
            aolx r1 = r4.k
            if (r1 != 0) goto L27
            aolx r1 = defpackage.aolx.a
        L27:
            boolean r1 = r1.d
            if (r1 != 0) goto L2d
            r0 = r0 | 1
        L2d:
            if (r5 != 0) goto L41
            uck r5 = r2.d
            boolean r5 = r5.f
            if (r5 == 0) goto L41
            aolx r4 = r4.k
            if (r4 != 0) goto L3b
            aolx r4 = defpackage.aolx.a
        L3b:
            boolean r4 = r4.e
            if (r4 != 0) goto L41
            r0 = r0 | 4
        L41:
            r3.l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhj.f(fi, aolz, boolean):void");
    }

    public final List h(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aome aomeVar = (aome) it.next();
            if (!aomeVar.b.isEmpty() || !aomeVar.c.isEmpty()) {
                String str = aomeVar.b;
                String str2 = aomeVar.c;
                arrayList.add(((uez) this.f.get()).a(str, i, i2));
                if (arrayList.size() >= 4) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
