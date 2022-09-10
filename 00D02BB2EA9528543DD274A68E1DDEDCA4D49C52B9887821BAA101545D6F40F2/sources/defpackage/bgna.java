package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: bgna  reason: default package */
/* loaded from: classes3.dex */
public final class bgna {
    public static final EnumMap<dioq, Integer> a;
    public static final EnumMap<dioo, EnumMap<bgnk, ddho>> b;

    static {
        dcdg dcdgVar = new dcdg();
        dioq dioqVar = dioq.UNKNOWN_TYPE;
        Integer valueOf = Integer.valueOf((int) R.string.CTA_LEARN_MORE);
        dcdgVar.f(dioqVar, valueOf);
        dcdgVar.f(dioq.BOOK, Integer.valueOf((int) R.string.CTA_BOOK));
        dcdgVar.f(dioq.ORDER, Integer.valueOf((int) R.string.CTA_ORDER));
        dcdgVar.f(dioq.SHOP, Integer.valueOf((int) R.string.CTA_SHOP));
        dcdgVar.f(dioq.CONTACT, Integer.valueOf((int) R.string.CTA_CONTACT));
        dcdgVar.f(dioq.LEARN_MORE, valueOf);
        dcdgVar.f(dioq.SIGN_UP, Integer.valueOf((int) R.string.CTA_SIGN_UP));
        dcdgVar.f(dioq.VIDEO, Integer.valueOf((int) R.string.CTA_VIDEO));
        dcdgVar.f(dioq.RESERVE, Integer.valueOf((int) R.string.CTA_RESERVE));
        dcdgVar.f(dioq.GET_OFFER, Integer.valueOf((int) R.string.CTA_GET_OFFER));
        a = new EnumMap<>(dcdgVar.b());
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(bgnk.PLACESHEET_CAROUSEL, dtxy.js);
        dcdgVar2.f(bgnk.PLACESHEET_OVERVIEW_TAB, dtxy.jy);
        dcdgVar2.f(bgnk.PLACESHEET_POST_TAB, dtxu.aB);
        dcdgVar2.f(bgnk.FOR_YOU_STREAM, dtxu.bj);
        dcdgVar2.f(bgnk.PLACESHEET_VIDEO_FULL_SCREEN, dtxu.aS);
        dcdg dcdgVar3 = new dcdg();
        dcdgVar3.f(bgnk.PLACESHEET_CAROUSEL, dtxy.jr);
        dcdgVar3.f(bgnk.PLACESHEET_OVERVIEW_TAB, dtxy.jx);
        dcdgVar3.f(bgnk.PLACESHEET_POST_TAB, dtxu.aA);
        dcdgVar3.f(bgnk.FOR_YOU_STREAM, dtxu.bk);
        dcdgVar3.f(bgnk.PLACESHEET_VIDEO_FULL_SCREEN, dtxu.aQ);
        dcdg dcdgVar4 = new dcdg();
        dcdgVar4.f(dioo.URL_ACTION, new EnumMap(dcdgVar3.b()));
        dcdgVar4.f(dioo.CALL_ACTION, new EnumMap(dcdgVar2.b()));
        b = new EnumMap<>(dcdgVar4.b());
    }

    public static CharSequence a(Activity activity, String str, int i) {
        return i >= 0 ? activity.getString(R.string.CTA_ACTION_CONTENT_DESCRIPTION, new Object[]{str, Integer.valueOf(i + 1)}) : str;
    }
}
