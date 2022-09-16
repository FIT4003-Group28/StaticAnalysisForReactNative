package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: bixc  reason: default package */
/* loaded from: classes3.dex */
public class bixc implements biwl {
    private final Activity a;
    private final dnvr b;
    private final dqgh c;
    private final boxa d;
    private final bwrs<ilo> e;
    private final bydk f;
    private final cjtd g;
    private final boolean h;
    @dzsi
    private final String i;
    @dzsi
    private final String j;

    public bixc(Activity activity, boxa boxaVar, dnvr dnvrVar, cjtd cjtdVar, bwrs<ilo> bwrsVar, boolean z) {
        this.a = activity;
        this.d = boxaVar;
        this.g = cjtdVar;
        this.e = bwrsVar;
        this.b = dnvrVar;
        this.h = z;
        dqgh b = dqgh.b(dnvrVar.b);
        b = b == null ? dqgh.UNDEFINED : b;
        this.c = b;
        bydk bydkVar = new bydk(activity);
        this.f = bydkVar;
        if (b != dqgh.BUSINESS_HOURS) {
            this.i = null;
            this.j = null;
            return;
        }
        dnfe dnfeVar = dnvrVar.d;
        dgsl dgslVar = (dnfeVar == null ? dnfe.p : dnfeVar).l;
        dgslVar = dgslVar == null ? dgsl.b : dgslVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        List<String> b2 = bydkVar.b(dgslVar, TimeZone.getTimeZone(c.aT()));
        int size = b2.size();
        if (size > 3) {
            b2 = b2.subList(0, 2);
            int i = size - 2;
            this.j = activity.getResources().getQuantityString(R.plurals.PLACE_PENDING_EDIT_MORE_EDITS, i, Integer.valueOf(i));
        } else {
            this.j = null;
        }
        this.i = dbrz.f('\n').g(b2);
    }

    @Override // defpackage.biwl
    public CharSequence a() {
        if (this.h) {
            dqgh dqghVar = dqgh.UNDEFINED;
            int ordinal = this.c.ordinal();
            if (ordinal == 1) {
                return this.a.getString(R.string.FACTUAL_MODERATION_NAME_QUESTION);
            }
            if (ordinal == 4) {
                return this.a.getString(R.string.FACTUAL_MODERATION_ADDRESS_QUESTION);
            }
            if (ordinal == 5) {
                return this.a.getString(R.string.FACTUAL_MODERATION_CATEGORY_QUESTION);
            }
            if (ordinal == 6) {
                return this.a.getString(R.string.FACTUAL_MODERATION_WEBSITE_QUESTION);
            }
            if (ordinal == 18) {
                return this.a.getString(R.string.FACTUAL_MODERATION_PHONE_QUESTION);
            }
            if (ordinal == 19) {
                return this.a.getString(R.string.FACTUAL_MODERATION_HOURS_QUESTION);
            }
            return this.a.getString(R.string.IS_THIS_RIGHT);
        }
        dosq b = dosq.b(this.b.e);
        if (b == null) {
            b = dosq.VOTE_UNKNOWN;
        }
        if (b == dosq.VOTE_CORRECT) {
            return this.a.getString(R.string.PLACE_PENDING_EDIT_IN_REVIEW);
        }
        dqgh dqghVar2 = dqgh.UNDEFINED;
        int ordinal2 = this.c.ordinal();
        if (ordinal2 == 1) {
            return this.a.getString(R.string.PLACE_PENDING_EDIT_NAME);
        }
        if (ordinal2 == 4) {
            return this.a.getString(R.string.PLACE_PENDING_EDIT_ADDRESS);
        }
        if (ordinal2 == 5) {
            return this.a.getString(R.string.PLACE_PENDING_EDIT_CATEGORY);
        }
        if (ordinal2 == 6) {
            return this.a.getString(R.string.PLACE_PENDING_EDIT_WEBSITE);
        }
        if (ordinal2 == 18) {
            return this.a.getString(R.string.PLACE_PENDING_EDIT_PHONE_NUMBER);
        }
        if (ordinal2 != 19) {
            switch (ordinal2) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return this.a.getString(R.string.PLACE_PENDING_EDIT_STATUS);
                default:
                    return this.a.getString(R.string.PLACE_PENDING_EDIT_NEW_INFO);
            }
        }
        return this.a.getString(R.string.PLACE_PENDING_EDIT_HOURS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 == defpackage.dosq.VOTE_UNKNOWN) goto L23;
     */
    @Override // defpackage.biwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean b() {
        /*
            r4 = this;
            boolean r0 = r4.h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            dnvr r0 = r4.b
            int r0 = r0.a
            r0 = r0 & 8
            if (r0 == 0) goto Lf
            r1 = 1
        Lf:
            r0 = r1 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L16:
            dnvr r0 = r4.b
            int r3 = r0.a
            r3 = r3 & 8
            if (r3 == 0) goto L3c
            int r0 = r0.e
            dosq r0 = defpackage.dosq.b(r0)
            if (r0 != 0) goto L28
            dosq r0 = defpackage.dosq.VOTE_UNKNOWN
        L28:
            dosq r3 = defpackage.dosq.VOTE_CORRECT
            if (r0 == r3) goto L3c
            dnvr r0 = r4.b
            int r0 = r0.e
            dosq r0 = defpackage.dosq.b(r0)
            if (r0 != 0) goto L38
            dosq r0 = defpackage.dosq.VOTE_UNKNOWN
        L38:
            dosq r3 = defpackage.dosq.VOTE_UNKNOWN
            if (r0 != r3) goto L3d
        L3c:
            r1 = 1
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bixc.b():java.lang.Boolean");
    }

    @Override // defpackage.biwl
    @dzsi
    public cqtd c() {
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.c.ordinal();
        int i = 0;
        if (ordinal == 1) {
            i = 2131231614;
        } else if (ordinal != 5) {
            switch (ordinal) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    i = 2131232558;
                    break;
                default:
                    if ((this.b.a & 2) == 0) {
                        int ordinal2 = this.c.ordinal();
                        if (ordinal2 == 6) {
                            i = 2131231775;
                            break;
                        } else if (ordinal2 == 18) {
                            i = 2131231713;
                            break;
                        } else if (ordinal2 == 19) {
                            i = 2131231600;
                            break;
                        }
                    }
                    break;
            }
        } else {
            i = 2131231599;
        }
        if (i == 0) {
            return null;
        }
        return cqrt.g(i, ibm.x());
    }

    @Override // defpackage.biwl
    public Boolean d() {
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.c.ordinal();
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal == 5) {
                dnvr dnvrVar = this.b;
                if ((dnvrVar.a & 16) == 0 || dnvrVar.f.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.biwl
    public Boolean e() {
        return Boolean.FALSE;
    }

    @Override // defpackage.biwl
    public CharSequence f() {
        if (this.c == dqgh.CATEGORY) {
            return this.b.f;
        }
        dnfe dnfeVar = this.b.c;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        return dnfeVar.c;
    }

    @Override // defpackage.biwl
    public CharSequence g() {
        dqgh dqghVar = dqgh.UNDEFINED;
        int ordinal = this.c.ordinal();
        if (ordinal != 5) {
            if (ordinal != 19) {
                switch (ordinal) {
                    case 8:
                        dnfe dnfeVar = this.b.d;
                        if (dnfeVar == null) {
                            dnfeVar = dnfe.p;
                        }
                        if (dnfeVar.d) {
                            return this.a.getString(R.string.PLACE_STATUS_CLOSED);
                        }
                        return this.a.getString(R.string.RAP_PLACE_IS_OPEN);
                    case 9:
                        return this.a.getString(R.string.PLACE_STATUS_DOES_NOT_EXIST);
                    case 10:
                        return this.a.getString(R.string.PLACE_STATUS_PRIVATE);
                    case 11:
                        return this.a.getString(R.string.PLACE_STATUS_SPAM);
                    case 12:
                        return this.a.getString(R.string.PLACE_STATUS_MOVED);
                    default:
                        dnfe dnfeVar2 = this.b.d;
                        if (dnfeVar2 == null) {
                            dnfeVar2 = dnfe.p;
                        }
                        return dnfeVar2.c;
                }
            }
            String str = this.i;
            dbsk.s(str);
            return str;
        }
        return this.b.g;
    }

    @Override // defpackage.biwl
    @dzsi
    public CharSequence h() {
        return this.j;
    }

    @Override // defpackage.biwl
    public cqkl i() {
        this.d.T(this.e, this.c);
        return cqkl.a;
    }

    @Override // defpackage.biwl
    public cjtd j() {
        return this.g;
    }

    @Override // defpackage.biwl
    public Boolean k() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.biwl
    public Boolean l() {
        dnvr dnvrVar = this.b;
        boolean z = true;
        if ((dnvrVar.a & 8) != 0) {
            dosq b = dosq.b(dnvrVar.e);
            if (b == null) {
                b = dosq.VOTE_UNKNOWN;
            }
            if (b != dosq.VOTE_UNKNOWN) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
