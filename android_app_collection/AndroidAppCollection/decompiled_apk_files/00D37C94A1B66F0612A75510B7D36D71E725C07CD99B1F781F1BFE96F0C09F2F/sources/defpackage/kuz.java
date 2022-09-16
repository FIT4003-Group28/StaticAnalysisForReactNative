package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: kuz  reason: default package */
/* loaded from: classes3.dex */
public abstract class kuz implements ajzh {
    public final acti A;
    public final aadd B;
    public apzg C;
    public asbz D;
    public auwg E;
    protected ascj F;
    public Bundle G;
    public String H;
    public kux I;

    /* renamed from: J  reason: collision with root package name */
    public atnp f221J;
    public final aacz K;
    public final Activity y;
    public final LoadingFrameLayout z;

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|(1:5)(1:38)|6|(12:33|34|9|10|11|(1:13)|15|(3:17|18|19)|22|(3:24|(1:26)(1:28)|27)|29|(1:31))|8|9|10|11|(0)|15|(0)|22|(0)|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        r1.E = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: aopx -> 0x0059, TRY_LEAVE, TryCatch #2 {aopx -> 0x0059, blocks: (B:17:0x0044, B:19:0x004a), top: B:47:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kuz(com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout r2, android.app.Activity r3, defpackage.acti r4, defpackage.aacz r5, defpackage.aadd r6, android.os.Bundle r7, defpackage.akam r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuz.<init>(com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout, android.app.Activity, acti, aacz, aadd, android.os.Bundle, akam):void");
    }

    public abstract void a();

    public abstract void b(String str, String str2);

    public abstract void c(Configuration configuration);

    public abstract void d(String str);

    public abstract boolean e();

    public void k(Bundle bundle) {
        auwg auwgVar = this.E;
        if (auwgVar != null) {
            bundle.putParcelable("innertube_search_filters", aphq.k(auwgVar));
        }
        ascj ascjVar = this.F;
        if (ascjVar != null) {
            bundle.putByteArray("searchbox_stats", ascjVar.toByteArray());
        }
        apzg apzgVar = this.C;
        if (apzgVar != null) {
            bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        }
        bundle.putString("clone_csn", this.A.k());
    }

    public final List o() {
        ArrayList arrayList = new ArrayList();
        for (auwe auweVar : this.E.b) {
            int i = 0;
            while (i < auweVar.c.size()) {
                auwf auwfVar = (auwf) auweVar.c.get(i);
                int aY = awwc.aY(auwfVar.d);
                if (aY != 0 && aY == 3) {
                    if (auweVar.d || i != 0) {
                        arrayList.add(auwfVar.e);
                    } else {
                        i = 0;
                    }
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // defpackage.ajzh
    public akam pn() {
        return new kuy(this.D, this.G);
    }
}
