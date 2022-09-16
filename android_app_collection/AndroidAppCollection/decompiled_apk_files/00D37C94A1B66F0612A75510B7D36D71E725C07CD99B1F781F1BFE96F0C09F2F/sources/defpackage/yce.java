package defpackage;

import android.app.AlertDialog;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: yce  reason: default package */
/* loaded from: classes4.dex */
public final class yce {
    public static auye a(ashn ashnVar) {
        if (ashnVar != null) {
            ashf ashfVar = ashnVar.d;
            if (ashfVar == null) {
                ashfVar = ashf.a;
            }
            if (ashfVar.b != 202129111) {
                return null;
            }
            ashf ashfVar2 = ashnVar.d;
            if (ashfVar2 == null) {
                ashfVar2 = ashf.a;
            }
            if (ashfVar2.b == 202129111) {
                return (auye) ashfVar2.c;
            }
            return auye.a;
        }
        return null;
    }

    public static awja b(ashn ashnVar) {
        if (ashnVar != null) {
            ashf ashfVar = ashnVar.d;
            if (ashfVar == null) {
                ashfVar = ashf.a;
            }
            if (ashfVar.b != 65500215) {
                return null;
            }
            ashf ashfVar2 = ashnVar.d;
            if (ashfVar2 == null) {
                ashfVar2 = ashf.a;
            }
            if (ashfVar2.b == 65500215) {
                return (awja) ashfVar2.c;
            }
            return awja.a;
        }
        return null;
    }

    public static amuk c(awid awidVar) {
        if (awidVar != null) {
            awie awieVar = awidVar.d;
            if (awieVar == null) {
                awieVar = awie.a;
            }
            if ((awieVar.b & 2) != 0) {
                awie awieVar2 = awidVar.d;
                if (awieVar2 == null) {
                    awieVar2 = awie.a;
                }
                awhy awhyVar = awieVar2.c;
                if (awhyVar == null) {
                    awhyVar = awhy.a;
                }
                if (awhyVar.c.size() != 0) {
                    ArrayList arrayList = new ArrayList(awhyVar.c.size());
                    for (awhz awhzVar : awhyVar.c) {
                        if ((awhzVar.b & 1) != 0) {
                            awia awiaVar = awhzVar.c;
                            if (awiaVar == null) {
                                awiaVar = awia.a;
                            }
                            arrayList.add(awiaVar);
                        }
                    }
                    return amuk.o(arrayList);
                }
            }
        }
        return amuk.q();
    }

    public static awhw d(awid awidVar) {
        awie awieVar = awidVar.d;
        if (awieVar == null) {
            awieVar = awie.a;
        }
        awhy awhyVar = awieVar.c;
        if (awhyVar == null) {
            awhyVar = awhy.a;
        }
        if ((awhyVar.b & 1) != 0) {
            awie awieVar2 = awidVar.d;
            if (awieVar2 == null) {
                awieVar2 = awie.a;
            }
            awhy awhyVar2 = awieVar2.c;
            if (awhyVar2 == null) {
                awhyVar2 = awhy.a;
            }
            awhv awhvVar = awhyVar2.d;
            if (awhvVar == null) {
                awhvVar = awhv.a;
            }
            if (awhvVar.b == 123879355) {
                return (awhw) awhvVar.c;
            }
            return awhw.a;
        }
        return null;
    }

    public static CharSequence[] e(List list, aafo aafoVar) {
        if (list.isEmpty()) {
            return null;
        }
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charSequenceArr[i] = aafv.a((arag) list.get(i), aafoVar, false);
        }
        return charSequenceArr;
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (lj.e(view) == 1) {
            rect.left -= i3;
            rect.right += i;
        } else {
            rect.left -= i;
            rect.right += i3;
        }
        rect.top -= i2;
        rect.bottom += i4;
        zdf.b(viewGroup, view, new TouchDelegate(rect, view));
    }

    public static void g(AlertDialog alertDialog) {
        if (alertDialog == null) {
            return;
        }
        alertDialog.show();
        ((TextView) alertDialog.findViewById(16908299)).setLineSpacing(0.0f, 1.2f);
    }
}
