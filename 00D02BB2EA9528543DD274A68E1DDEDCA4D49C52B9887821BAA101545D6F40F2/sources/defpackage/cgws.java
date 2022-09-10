package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgws  reason: default package */
/* loaded from: classes4.dex */
public class cgws extends cgww {
    public cgws(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar) {
        super(activity, cgskVar, bwrsVar, list, dwqlVar, chakVar, btvoVar, gesVar, cgumVar);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public boolean G() {
        ilo c = this.k.c();
        dqgh b = dqgh.b(this.c.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        if (b != dqgh.CLOSED || c == null || !c.f) {
            return true;
        }
        dnfe dnfeVar = this.c.d;
        if (dnfeVar == null) {
            dnfeVar = dnfe.p;
        }
        return !dnfeVar.d ? c.an() || c.ao() : !c.an();
    }

    @Override // defpackage.cgww
    @dzsi
    public dnfe ad() {
        return null;
    }

    @Override // defpackage.cgww
    protected final dosq af() {
        dqgh b = dqgh.b(this.c.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        if (b == dqgh.DOES_NOT_EXIST) {
            dnfe dnfeVar = this.c.d;
            if (dnfeVar == null) {
                dnfeVar = dnfe.p;
            }
            if (dnfeVar.d) {
                if (this.e == dosq.VOTE_CORRECT) {
                    return dosq.VOTE_INCORRECT;
                }
                if (this.e == dosq.VOTE_INCORRECT) {
                    return dosq.VOTE_CORRECT;
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence b() {
        dqgh dqghVar = dqgh.UNDEFINED;
        dqgh b = dqgh.b(this.c.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        switch (b.ordinal()) {
            case 8:
                dnfe dnfeVar = this.c.d;
                if (dnfeVar == null) {
                    dnfeVar = dnfe.p;
                }
                if (dnfeVar.d) {
                    return this.a.getString(R.string.FACTUAL_MODERATION_CLOSED_QUESTION);
                }
                return this.a.getString(R.string.FACTUAL_MODERATION_OPEN_QUESTION);
            case 9:
                return this.a.getString(R.string.FACTUAL_MODERATION_EXIST_QUESTION);
            case 10:
                return this.a.getString(R.string.FACTUAL_MODERATION_PRIVATE_QUESTION);
            case 11:
                return this.a.getString(R.string.FACTUAL_MODERATION_SPAM_QUESTION);
            case 12:
                return this.a.getString(R.string.FACTUAL_MODERATION_MOVED_QUESTION);
            default:
                return "";
        }
    }

    @Override // defpackage.cgww, defpackage.cgva
    public CharSequence e() {
        dqgh dqghVar = dqgh.UNDEFINED;
        dqgh b = dqgh.b(this.c.b);
        if (b == null) {
            b = dqgh.UNDEFINED;
        }
        switch (b.ordinal()) {
            case 8:
            case 9:
                return this.a.getString(R.string.FACTUAL_MODERATION_OPEN_STATUS_TITLE);
            case 10:
                return this.a.getString(R.string.FACTUAL_MODERATION_PRIVATE_TITLE);
            case 11:
                return this.a.getString(R.string.FACTUAL_MODERATION_SPAM_TITLE);
            case 12:
                return this.a.getString(R.string.FACTUAL_MODERATION_MOVED_TITLE);
            default:
                return "";
        }
    }

    @Override // defpackage.cgww, defpackage.cgva
    public cqtd g() {
        return cqrt.f(2131232558);
    }
}
