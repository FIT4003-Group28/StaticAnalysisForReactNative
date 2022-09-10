package defpackage;

import com.google.android.apps.maps.R;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhxo  reason: default package */
/* loaded from: classes3.dex */
public class bhxo implements bhwv {
    final /* synthetic */ bhxy a;
    @dzsi
    private String b;
    @dzsi
    private dnvu c;
    private final boolean d;

    public bhxo(@dzsi bhxy bhxyVar, String str) {
        this(bhxyVar, str, false, null);
    }

    public bhxo(@dzsi bhxy bhxyVar, String str, @dzsi boolean z, dnvu dnvuVar) {
        this.a = bhxyVar;
        this.b = str;
        this.d = z;
        this.c = null;
    }

    private final ddho i() {
        return this.a.H(this.b) ? dtxj.av : this.a.I(this.b) ? dtxj.aw : dtxj.au;
    }

    @Override // defpackage.bhwv
    public jic a() {
        if (this.a.H(this.b)) {
            return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131231654, irg.c()), 0);
        }
        if (this.a.I(this.b)) {
            return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131231777, irg.c()), 0);
        }
        if (!this.d) {
            return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131231285, irg.c()), 0);
        }
        dnvu dnvuVar = this.c;
        if (dnvuVar != null) {
            return new jic(dnvuVar.d, ckqc.FULLY_QUALIFIED, 2131232998, 0);
        }
        return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131231567, irg.c()), 0);
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(@dzsi dnvu dnvuVar) {
        this.c = dnvuVar;
        if (dnvuVar != null) {
            b(dnvuVar.c);
        }
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.d) {
            dnvu dnvuVar = this.c;
            if (dnvuVar != null) {
                this.a.j.a(dnvuVar);
            } else {
                this.a.j.b(this.b);
            }
            return cqkl.a;
        }
        bhxy bhxyVar = this.a;
        String str = bhxyVar.h;
        bhxyVar.h = this.b;
        bhxyVar.z(null, i());
        bhxy bhxyVar2 = this.a;
        bhxyVar2.h = str;
        cqkx.p(bhxyVar2);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(i());
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        if (this.a.H(this.b)) {
            ff ffVar = this.a.a;
            return ffVar.getString(R.string.SET_AS_HOME_OR_WORK_ALIAS, new Object[]{ffVar.getString(R.string.HOME_LOCATION).toLowerCase(Locale.getDefault())});
        } else if (this.a.I(this.b)) {
            ff ffVar2 = this.a.a;
            return ffVar2.getString(R.string.SET_AS_HOME_OR_WORK_ALIAS, new Object[]{ffVar2.getString(R.string.WORK_LOCATION).toLowerCase(Locale.getDefault())});
        } else if (!this.d) {
            if (this.a.F()) {
                return this.a.a.getString(R.string.NICKNAME_UPDATE_LIST_TEXT);
            }
            return this.a.a.getString(R.string.NICKNAME_LIST_TEXT);
        } else {
            dnvu dnvuVar = this.c;
            if (dnvuVar == null) {
                return this.a.a.getString(R.string.ALIAS_CREATE_CONTACT);
            }
            if ((dnvuVar.a & 8) == 0 || dnvuVar.e.isEmpty()) {
                return this.a.a.getString(R.string.ALIAS_GOOGLE_CONTACT);
            }
            return this.a.a.getString(R.string.ALIAS_GOOGLE_CONTACT_WITH_EMAIL_ADDRESS, new Object[]{this.c.e});
        }
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.b;
    }
}
