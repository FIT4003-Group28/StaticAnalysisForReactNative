package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mhn  reason: default package */
/* loaded from: classes7.dex */
public class mhn implements mhk {
    private final baab a;
    private final cqtd b;
    private final mhj c;
    private final Boolean d;
    private final String e;
    private final String f;
    private final Long g;
    private final ckco h;

    public mhn(Context context, baab baabVar, mhj mhjVar, Boolean bool, String str, String str2, Long l, ckcw ckcwVar) {
        iuw aH;
        String string;
        baab baabVar2 = baab.FAVORITES;
        int ordinal = baabVar.ordinal();
        if (ordinal == 0) {
            aH = nqu.aH(R.raw.car_only_ic_favorite_place_filled_36dp, nql.q);
        } else if (ordinal == 1) {
            aH = nqu.aH(R.raw.car_only_ic_want_to_go_place_filled_36dp, nql.p);
        } else if (ordinal == 2 || ordinal == 3) {
            aH = nqu.aH(R.raw.car_only_ic_starred_place_filled_36dp, nql.o);
        } else if (ordinal == 5) {
            aH = nqu.aH(R.raw.car_only_ic_custom_raw_36, nql.s);
        } else {
            String valueOf = String.valueOf(baabVar.name());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected personal place list type: ".concat(valueOf) : new String("Unexpected personal place list type: "));
        }
        this.b = aH;
        this.a = baabVar;
        this.c = mhjVar;
        this.d = bool;
        if (baabVar == baab.CUSTOM) {
            this.e = str;
        } else {
            int ordinal2 = baabVar.ordinal();
            if (ordinal2 == 0) {
                string = context.getString(R.string.PERSONAL_CATEGORY_FAVORITES);
            } else if (ordinal2 == 1) {
                string = context.getString(R.string.PERSONAL_CATEGORY_WANT_TO_GO);
            } else if (ordinal2 == 2 || ordinal2 == 3) {
                string = context.getString(R.string.PERSONAL_CATEGORY_STARRED);
            } else {
                String valueOf2 = String.valueOf(baabVar.name());
                throw new IllegalStateException(valueOf2.length() != 0 ? "Unexpected personal place list type: ".concat(valueOf2) : new String("Unexpected personal place list type: "));
            }
            this.e = string;
        }
        this.f = str2;
        this.g = l;
        this.h = (ckco) ckcwVar.a(ckee.J);
    }

    @Override // defpackage.mhk
    public cqtd a() {
        return this.b;
    }

    @Override // defpackage.mhk
    public CharSequence b() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    @Override // defpackage.mhk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqkl c() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhn.c():cqkl");
    }

    @Override // defpackage.mhk
    public Boolean d() {
        return this.d;
    }

    @Override // defpackage.mhk
    public Long e() {
        return this.g;
    }

    @Override // defpackage.mhk
    public cjtd f() {
        deaa deaaVar = this.d.booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        cjta b = cjtd.b();
        ddzy bZ = deab.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.d = dtxm.dE;
        return b.a();
    }
}
