package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fmi  reason: default package */
/* loaded from: classes3.dex */
public final class fmi {
    public int a;
    private final boolean b;
    private final TextView c;
    private final Resources d;
    private final Context e;

    public fmi(TextView textView, boolean z) {
        this.c = textView;
        this.b = z;
        this.d = textView.getResources();
        this.e = textView.getContext();
    }

    private static boolean c(avaq avaqVar) {
        int aJ = awwc.aJ(avaqVar.v);
        return aJ != 0 && aJ == 2;
    }

    private static int d(avaq avaqVar) {
        int aI;
        if (avaqVar.d != 19 || (aI = awwc.aI(((avar) avaqVar.e).b)) == 0) {
            return 1;
        }
        return aI;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.avaq r11) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmi.a(avaq):void");
    }

    private final int b() {
        int i = this.a;
        if (i == 1) {
            return zhn.d(this.e, true != this.b ? R.attr.ytStaticBrandWhite : R.attr.ytOverlayTextSecondary);
        } else if (i == 3) {
            return zhn.d(this.e, R.attr.ytOverlayTextPrimary);
        } else {
            return zhn.d(this.e, true != this.b ? R.attr.ytBrandLinkText : R.attr.ytTextDisabled);
        }
    }
}
