package defpackage;

import android.app.Application;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.List;
/* compiled from: PG */
/* renamed from: bypl  reason: default package */
/* loaded from: classes4.dex */
public final class bypl implements auhr {
    private final dxio<byqh> a;
    private final Application b;
    private final byqg c;
    private final dxio<ckcw> d;

    public bypl(dxio<byqh> dxioVar, Application application, byqg byqgVar, dxio<ckcw> dxioVar2) {
        this.a = dxioVar;
        this.b = application;
        this.c = byqgVar;
        this.d = dxioVar2;
    }

    private final SpannableString b(List<dljq> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (dljq dljqVar : list) {
            if ((dljqVar.a & 1) != 0) {
                bvsv a = new bvsx(this.b.getResources()).a(dljqVar.b);
                if ((dljqVar.a & 2) != 0) {
                    String valueOf = String.valueOf(Integer.toHexString(dljqVar.c));
                    a.l(Color.parseColor(valueOf.length() != 0 ? "#".concat(valueOf) : new String("#")));
                }
                if (dljqVar.d) {
                    a.i();
                }
                spannableStringBuilder.append((CharSequence) a.c());
            }
        }
        return SpannableString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195  */
    @Override // defpackage.auhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.auof r10, defpackage.pau r11, defpackage.pas r12, defpackage.dlfv r13) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bypl.a(auof, pau, pas, dlfv):void");
    }
}
