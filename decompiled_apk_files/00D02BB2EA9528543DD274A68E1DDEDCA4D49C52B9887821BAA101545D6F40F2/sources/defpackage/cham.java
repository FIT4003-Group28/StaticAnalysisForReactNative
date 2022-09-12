package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cham  reason: default package */
/* loaded from: classes4.dex */
public class cham {
    private static final dcqe a = dcqe.c("cham");
    private static final Map<doqv, Boolean> b;
    private final cgyd c;
    private final cgya d;
    private final cgyn e;
    private final cgwx f;
    private final cgyi g;
    private final cgyk h;
    private final cgxo i;

    static {
        EnumMap enumMap = new EnumMap(doqv.class);
        b = enumMap;
        enumMap.put((EnumMap) doqv.REVIEW_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.RATING_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.PHOTO_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.SUGGEST_EDIT_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.FACTUAL_MODERATION_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.GENERIC_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.SCALABLE_ATTRIBUTES_TASK, (doqv) true);
        enumMap.put((EnumMap) doqv.STREET_NUMBER_VERIFICATION_TASK, (doqv) true);
    }

    public cham(dzsj<cgyd> dzsjVar, dzsj<cgya> dzsjVar2, dzsj<cgyn> dzsjVar3, dzsj<cgwx> dzsjVar4, dzsj<cgyi> dzsjVar5, dzsj<cgyk> dzsjVar6, dzsj<cgxo> dzsjVar7) {
        this.c = dzsjVar.a();
        this.d = dzsjVar2.a();
        this.e = dzsjVar3.a();
        this.f = dzsjVar4.a();
        this.g = dzsjVar5.a();
        this.h = dzsjVar6.a();
        this.i = dzsjVar7.a();
    }

    public static Boolean a(doqw doqwVar) {
        Boolean bool = b.get(doqv.a(doqwVar.a));
        boolean z = false;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0304 A[ADDED_TO_REGION] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cgwg b(defpackage.cgsk r18, defpackage.bwrs<defpackage.ilo> r19, defpackage.ges r20, java.util.List<defpackage.dwrg> r21, defpackage.dwql r22, defpackage.chak r23) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cham.b(cgsk, bwrs, ges, java.util.List, dwql, chak):cgwg");
    }
}
