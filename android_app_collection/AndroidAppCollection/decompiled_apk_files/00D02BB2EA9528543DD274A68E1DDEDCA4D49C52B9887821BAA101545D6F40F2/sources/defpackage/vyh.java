package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vyh  reason: default package */
/* loaded from: classes7.dex */
public final class vyh extends vyk {
    private static final String b = "vyh";
    private final Resources c;
    private final vtn d;
    private final alp e;
    private final List<dpce> f;
    private final String g;
    private final boolean h;

    public vyh(Context context, vtn vtnVar, List<dpce> list, String str, boolean z) {
        super(context);
        this.e = alp.a();
        this.c = context.getResources();
        this.d = vtnVar;
        this.f = list;
        this.g = str;
        this.h = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vyk
    public final List<RemoteViews> a(vyi vyiVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        bvsx bvsxVar = new bvsx(this.c);
        bvsv a = bvsxVar.a("");
        loop0: while (true) {
            z = true;
            boolean z2 = false;
            for (dpce dpceVar : this.f) {
                int a2 = dpcd.a(dpceVar.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i = a2 - 1;
                if (i == 9) {
                    bvoo.j(new RuntimeException("Unsupported component type."));
                } else if (i == 10) {
                    continue;
                } else {
                    douj doujVar = dpceVar.d;
                    if (doujVar == null) {
                        doujVar = douj.h;
                    }
                    if ((doujVar.a & 2) != 0) {
                        int i2 = dpceVar.b;
                        douj doujVar2 = dpceVar.d;
                        if (doujVar2 == null) {
                            doujVar2 = douj.h;
                        }
                        String str = alca.n(doujVar2).a;
                        Drawable g = str != null ? this.d.g(str, bvlw.a) : null;
                        if (g != null) {
                            if (!z) {
                                arrayList.add(vyj.a(this.a, vyiVar, a.c()));
                                a = bvsxVar.a("");
                            }
                            Context context = this.a;
                            String str2 = doujVar2.e;
                            Resources resources = context.getResources();
                            vyi vyiVar2 = vyi.TITLE;
                            int dimensionPixelSize = resources.getDimensionPixelSize(vyiVar.d);
                            arrayList.add(vyj.b(context, bvlf.c(g, dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888), str2, R.layout.notification_icon));
                        }
                    } else {
                        doul doulVar = dpceVar.c;
                        if (doulVar == null) {
                            doulVar = doul.f;
                        }
                        if ((doulVar.a & 1) != 0) {
                            int a3 = dpcd.a(dpceVar.b);
                            boolean z3 = a3 != 0 && a3 == 6;
                            if (z2 && z3) {
                                a.g(this.g);
                            } else if (!z) {
                                a.g(" ");
                            }
                            doul doulVar2 = dpceVar.c;
                            if (doulVar2 == null) {
                                doulVar2 = doul.f;
                            }
                            boolean z4 = z3 && this.h;
                            String b2 = this.e.b(doulVar2.b);
                            boolean z5 = (doulVar2.a & 4) != 0 && bvoa.d(doulVar2.d);
                            if (z4 && z5 && b2.codePointCount(0, b2.length()) > 6) {
                                b2 = String.valueOf(b2.substring(0, b2.offsetByCodePoints(0, 5))).concat("…");
                            }
                            if (z5) {
                                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 2);
                                sb.append(" ");
                                sb.append(b2);
                                sb.append(" ");
                                b2 = sb.toString();
                            }
                            bvsv a4 = new bvsx(this.c).a(b2);
                            if (z5) {
                                a4.h(Color.parseColor(doulVar2.d));
                            }
                            if ((doulVar2.a & 2) != 0) {
                                a4.i();
                            }
                            if ((doulVar2.a & 8) != 0 && bvoa.d(doulVar2.e)) {
                                a4.l(Color.parseColor(doulVar2.e));
                            }
                            a.f(a4);
                            z2 = z3;
                            z = false;
                        }
                    }
                }
            }
            break loop0;
        }
        if (!z) {
            arrayList.add(vyj.a(this.a, vyiVar, a.c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vyh vyhVar = (vyh) obj;
            if (dbsd.a(this.f, vyhVar.f) && dbsd.a(this.g, vyhVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, false});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (dpce dpceVar : this.f) {
            int i = dpceVar.a;
            if ((i & 4) != 0) {
                douj doujVar = dpceVar.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                sb.append(doujVar.e);
            } else if ((i & 2) != 0) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                sb.append(doulVar.b);
            }
        }
        return sb.toString();
    }
}
