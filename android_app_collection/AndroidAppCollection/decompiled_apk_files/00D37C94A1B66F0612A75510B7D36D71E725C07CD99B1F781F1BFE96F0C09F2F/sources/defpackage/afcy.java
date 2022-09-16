package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: afcy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afcy implements owa {
    public final /* synthetic */ FormatStreamModel[] a;
    private final /* synthetic */ int b;

    public /* synthetic */ afcy(FormatStreamModel[] formatStreamModelArr) {
        this.a = formatStreamModelArr;
    }

    public /* synthetic */ afcy(FormatStreamModel[] formatStreamModelArr, int i) {
        this.b = i;
        this.a = formatStreamModelArr;
    }

    @Override // defpackage.owa
    public final void a(owf owfVar, ovz ovzVar) {
        if (this.b == 0) {
            FormatStreamModel[] formatStreamModelArr = this.a;
            List list = owfVar.b(0).b;
            for (int i = 0; i < list.size(); i++) {
                owc owcVar = (owc) list.get(i);
                if (owcVar.a == 0) {
                    int[] af = afdv.af(formatStreamModelArr, owcVar);
                    if (af.length > 0) {
                        ovzVar.n(owfVar, i, af);
                    }
                }
            }
            return;
        }
        FormatStreamModel[] formatStreamModelArr2 = this.a;
        List list2 = owfVar.b(0).b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            owc owcVar2 = (owc) list2.get(i2);
            if (owcVar2.a == 1) {
                for (int i3 : afdv.af(formatStreamModelArr2, owcVar2)) {
                    ovzVar.o(owfVar, i2, i3);
                }
            }
        }
    }
}
