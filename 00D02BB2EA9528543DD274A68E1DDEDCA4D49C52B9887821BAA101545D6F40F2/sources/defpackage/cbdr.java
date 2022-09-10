package defpackage;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbdr  reason: default package */
/* loaded from: classes4.dex */
public class cbdr implements cbrl {
    private final cbau a;
    private final ges b;
    private final cbbc c;
    private final boolean d;
    private final cqkp e;
    private final gga f;

    public cbdr(cbau cbauVar, ges gesVar, cbbc cbbcVar, boolean z, cqkp cqkpVar, gga ggaVar) {
        this.a = cbauVar;
        this.b = gesVar;
        this.c = cbbcVar;
        this.e = cqkpVar;
        this.d = z;
        this.f = ggaVar;
    }

    private final String f(dptk dptkVar) {
        dqjj dqjjVar;
        cbbc cbbcVar = this.c;
        dqjj dqjjVar2 = dptkVar.b;
        if (dqjjVar2 == null) {
            dqjjVar2 = dqjj.e;
        }
        if ((dptkVar.a & 2) != 0) {
            dqjjVar = dptkVar.c;
            if (dqjjVar == null) {
                dqjjVar = dqjj.e;
            }
        } else {
            dqjjVar = null;
        }
        return cbbcVar.c(dqjjVar2, dqjjVar);
    }

    @Override // defpackage.cbrl
    public CharSequence a() {
        String string;
        dpsd a = this.a.a();
        String str = "";
        if (a == null) {
            return str;
        }
        if ((a.a & 1) != 0) {
            dpoh dpohVar = a.b;
            if (dpohVar == null) {
                dpohVar = dpoh.c;
            }
            gga ggaVar = this.f;
            Object[] objArr = new Object[1];
            dptk dptkVar = dpohVar.b;
            if (dptkVar == null) {
                dptkVar = dptk.d;
            }
            objArr[0] = f(dptkVar);
            str = ggaVar.getString(R.string.DAILY_REPEATING_SUMMARY, objArr);
        } else if (a.c.size() <= 0) {
            if (a.d.size() <= 0) {
                if (a.e.size() > 0) {
                    str = this.f.getString(R.string.CUSTOM_TITLE);
                }
            } else {
                dsrj<dpyf> dsrjVar = a.d;
                if (dsrjVar.size() <= 1) {
                    dpyf dpyfVar = dsrjVar.get(0);
                    if (dpyfVar.b.size() <= 1) {
                        gga ggaVar2 = this.f;
                        int i = dpyfVar.d.size() == 1 ? R.string.MONTHLY_REPEATING_SUMMARY_SINGLE_WEEK_OF_MONTH : R.string.MONTHLY_REPEATING_SUMMARY_MULTI_WEEK_OF_MONTH;
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = this.c.g(dcdc.r(dpyfVar.d));
                        objArr2[1] = this.c.d(dpyf.c.a(Integer.valueOf(dpyfVar.b.f(0))));
                        dptk dptkVar2 = dpyfVar.e;
                        if (dptkVar2 == null) {
                            dptkVar2 = dptk.d;
                        }
                        objArr2[2] = f(dptkVar2);
                        str = ggaVar2.getString(i, objArr2);
                    }
                }
            }
        } else {
            dsrj<dqmn> dsrjVar2 = a.c;
            if (dsrjVar2.size() <= 1) {
                dqmn dqmnVar = dsrjVar2.get(0);
                dptk dptkVar3 = dqmnVar.e;
                if (dptkVar3 == null) {
                    dptkVar3 = dptk.d;
                }
                String f = f(dptkVar3);
                if (dqmnVar.b != 1) {
                    if (dqmnVar.c.size() == 1) {
                        gga ggaVar3 = this.f;
                        dpol dpolVar = dpol.DAY_OF_WEEK_UNSPECIFIED;
                        int ordinal = dqmn.d.a(Integer.valueOf(dqmnVar.c.f(0))).ordinal();
                        int i2 = R.string.WEEKLY_REPEATING_SUMMARY_SUNDAY_EVERY_NUMBER_WEEKS;
                        switch (ordinal) {
                            case 1:
                                i2 = R.string.WEEKLY_REPEATING_SUMMARY_MONDAY_EVERY_NUMBER_WEEKS;
                                break;
                            case 2:
                                i2 = R.string.WEEKLY_REPEATING_SUMMARY_TUESDAY_EVERY_NUMBER_WEEKS;
                                break;
                            case 3:
                                i2 = R.string.WEEKLY_REPEATING_SUMMARY_WEDNESDAY_EVERY_NUMBER_WEEKS;
                                break;
                            case 4:
                                i2 = R.string.WEEKLY_REPEATING_SUMMARY_THURSDAY_EVERY_NUMBER_WEEKS;
                                break;
                            case 5:
                                i2 = R.string.WEEKLY_REPEATING_SUMMARY_FRIDAY_EVERY_NUMBER_WEEKS;
                                break;
                            case 6:
                                i2 = R.string.WEEKLY_REPEATING_SUMMARY_SATURDAY_EVERY_NUMBER_WEEKS;
                                break;
                        }
                        str = ggaVar3.getString(i2, new Object[]{Integer.valueOf(dqmnVar.b), f});
                    } else {
                        str = this.f.getString(R.string.WEEKLY_REPEATING_SUMMARY_MULTI_DAY_EVERY_NUMBER_WEEKS, new Object[]{Integer.valueOf(dqmnVar.b), this.c.f(dcdc.r(new dsrh(dqmnVar.c, dqmn.d))), f});
                    }
                } else if (dqmnVar.c.size() == 1) {
                    str = this.f.getString(R.string.WEEKLY_REPEATING_SUMMARY_ONE_DAY_EVERY_WEEK, new Object[]{this.c.d(dqmn.d.a(Integer.valueOf(dqmnVar.c.f(0)))), f});
                } else {
                    str = this.f.getString(R.string.WEEKLY_REPEATING_SUMMARY_MULTI_DAY_EVERY_WEEK, new Object[]{this.c.f(dcdc.r(new dsrh(dqmnVar.c, dqmn.d))), f});
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        dpvi b = this.a.b();
        dpvi c = this.a.c();
        dpsd a2 = this.a.a();
        if (c != null && (a2 == null || a2.e.size() <= 0)) {
            string = this.c.h(b, c);
        } else {
            string = this.f.getString(R.string.DATE_RANGE_STARTING_SUMMARY, new Object[]{this.c.i(b, true)});
        }
        sb.append(string);
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), str.length(), spannableString.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(ibm.p().b(this.f)), str.length(), spannableString.length(), 0);
        return spannableString;
    }

    @Override // defpackage.cbrl
    public cqkl b() {
        this.b.aZ(cbbt.g(this.a));
        return cqkl.a;
    }

    @Override // defpackage.cbrl
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.cbrl
    public cqkl d() {
        this.a.e();
        cqkx.p(this.e);
        return cqkl.a;
    }

    @Override // defpackage.cbrl
    public String e() {
        return this.f.getString(R.string.UGC_EVENTS_START_DATE_TIME_ENTRY_POINT_HINT);
    }
}
