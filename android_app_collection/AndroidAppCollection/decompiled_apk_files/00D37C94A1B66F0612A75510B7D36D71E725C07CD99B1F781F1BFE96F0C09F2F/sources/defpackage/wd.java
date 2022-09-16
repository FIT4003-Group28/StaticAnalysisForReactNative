package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Range;
import android.util.Size;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: wd  reason: default package */
/* loaded from: classes4.dex */
public final class wd implements Comparator {
    private final /* synthetic */ int c;
    public static final wd b = new wd(12);
    public static final wd a = new wd(5);

    public wd() {
    }

    public wd(int i) {
        this.c = i;
    }

    public static final int a(afes afesVar, afes afesVar2) {
        int b2;
        int b3;
        if (afesVar2.b() == afesVar.b()) {
            b2 = afesVar2.a();
            b3 = afesVar.a();
        } else {
            b2 = afesVar2.b();
            b3 = afesVar.b();
        }
        return b2 - b3;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int a2;
        int a3;
        switch (this.c) {
            case 0:
                wf wfVar = (wf) obj;
                wf wfVar2 = (wf) obj2;
                RecyclerView recyclerView = wfVar.d;
                if ((recyclerView == null) != (wfVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z = wfVar.a;
                if (z != wfVar2.a) {
                    return z ? -1 : 1;
                }
                int i = wfVar2.b - wfVar.b;
                if (i != 0) {
                    return i;
                }
                int i2 = wfVar.c - wfVar2.c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            case 1:
                return ((cmf) obj).a - ((cmf) obj2).a;
            case 2:
                return ((ahc) obj).c - ((ahc) obj2).c;
            case 3:
                float b2 = lj.b((View) obj);
                float b3 = lj.b((View) obj2);
                if (b2 > b3) {
                    return -1;
                }
                return b2 < b3 ? 1 : 0;
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b4 = bArr[i3];
                    byte b5 = bArr2[i3];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 5:
                return ((bhc) obj).d.compareToIgnoreCase(((bhc) obj2).d);
            case 6:
                a2 = ((bik) obj2).a();
                a3 = ((bik) obj).a();
                break;
            case 7:
                return ((bpk) obj).b - ((bpk) obj2).b;
            case 8:
                Object obj3 = ((dmw) obj).a;
                Object obj4 = ((dmw) obj2).a;
                dbn dbnVar = (dbn) obj3;
                int i4 = dbnVar.c.top;
                dbn dbnVar2 = (dbn) obj4;
                int i5 = dbnVar2.c.top;
                return i4 == i5 ? dbnVar.i - dbnVar2.i : i4 - i5;
            case 9:
                Object obj5 = ((dmw) obj).a;
                Object obj6 = ((dmw) obj2).a;
                dbn dbnVar3 = (dbn) obj5;
                int i6 = dbnVar3.c.bottom;
                dbn dbnVar4 = (dbn) obj6;
                int i7 = dbnVar4.c.bottom;
                return i6 == i7 ? dbnVar4.i - dbnVar3.i : i6 - i7;
            case 10:
                a2 = ((fpf) obj2).c();
                a3 = ((fpf) obj).c();
                break;
            case 11:
                a2 = ((ovm) obj2).c;
                a3 = ((ovm) obj).c;
                break;
            case 12:
                return ((saw) obj).a() - ((saw) obj2).a();
            case 13:
                a2 = ((FormatStreamModel) obj2).f;
                a3 = ((FormatStreamModel) obj).f;
                break;
            case 14:
                int intValue = ((Integer) ((Range) obj).getLower()).intValue();
                int intValue2 = ((Integer) ((Range) obj2).getLower()).intValue();
                if (intValue == intValue2) {
                    return 0;
                }
                return intValue >= intValue2 ? 1 : -1;
            case 15:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 16:
                return ((FormatStreamModel) obj).g - ((FormatStreamModel) obj2).g;
            case 17:
                a2 = ((FormatStreamModel) obj2).f;
                a3 = ((FormatStreamModel) obj).f;
                break;
            case 18:
                int i8 = ((aepz) obj).a;
                int i9 = ((aepz) obj2).a;
                if (i8 > i9) {
                    return 1;
                }
                return i8 >= i9 ? 0 : -1;
            case 19:
                return Float.compare(((aepz) obj).b, ((aepz) obj2).b);
            default:
                return a((afes) obj, (afes) obj2);
        }
        return a2 - a3;
    }
}
