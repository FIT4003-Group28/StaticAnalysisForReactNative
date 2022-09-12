package defpackage;

import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: akeu  reason: default package */
/* loaded from: classes2.dex */
public abstract class akeu implements Serializable {
    public static aker i(aket aketVar) {
        akel akelVar = new akel();
        if (aketVar != null) {
            akelVar.a = aketVar;
            return akelVar;
        }
        throw new NullPointerException("Null ensuredAccountCallback");
    }

    public static akep j(akeo akeoVar) {
        akej akejVar = new akej();
        if (akeoVar != null) {
            akejVar.a = akeoVar;
            return akejVar;
        }
        throw new NullPointerException("Null ensuredAccountCallback");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aken k() {
        akeh akehVar = new akeh();
        akehVar.b(btlt.GOOGLE);
        akehVar.f(R.string.SIGN_IN);
        akehVar.g(0);
        akehVar.i(R.string.LOGIN_PROMPT_PANEL_OOB_TITLE);
        akehVar.h(R.string.SAVE_PLACE_PROMOTION_MESSAGE);
        akehVar.d(R.string.DISABLE_INCOGNITO_PROMO_FRAGMENT_DEFAULT_TOOLBAR_TITLE);
        akehVar.e(0);
        akehVar.c(R.string.DISABLE_INCOGNITO_PROMO_FRAGMENT_DEFAULT_BODY_TEXT);
        return akehVar;
    }

    public abstract dcep<btlt> a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
