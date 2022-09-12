package defpackage;

import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bhhw  reason: default package */
/* loaded from: classes3.dex */
public abstract class bhhw implements Serializable {
    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract ddho e();

    public abstract ddho f();

    public static bhhw g() {
        bhhs bhhsVar = new bhhs();
        bhhsVar.a = Integer.valueOf((int) R.string.ADD_MENU_PHOTOS_INTRO_TITLE_LABEL);
        bhhsVar.b = Integer.valueOf((int) R.string.ADD_MENU_PHOTOS_INTRO_DESCRIPTION_LABEL);
        bhhsVar.c = Integer.valueOf((int) R.string.ADD_MENU_PHOTOS_INTRO_HELPER_LABEL);
        bhhsVar.d = Integer.valueOf((int) R.string.ADD_MENU_PHOTOS_INTRO_NEXT_BUTTON);
        bhhsVar.e = dtxv.cj;
        bhhsVar.f = dtxv.ck;
        String str = bhhsVar.a == null ? " titleLabelStringId" : "";
        if (bhhsVar.b == null) {
            str = str.concat(" descriptionLabelStringId");
        }
        if (bhhsVar.c == null) {
            str = String.valueOf(str).concat(" helperLabelStringId");
        }
        if (bhhsVar.d == null) {
            str = String.valueOf(str).concat(" nextButtonStringId");
        }
        if (bhhsVar.e == null) {
            str = String.valueOf(str).concat(" pageVe");
        }
        if (bhhsVar.f == null) {
            str = String.valueOf(str).concat(" nextButtonVe");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bhht(bhhsVar.a.intValue(), bhhsVar.b.intValue(), bhhsVar.c.intValue(), bhhsVar.d.intValue(), bhhsVar.e, bhhsVar.f);
    }
}
