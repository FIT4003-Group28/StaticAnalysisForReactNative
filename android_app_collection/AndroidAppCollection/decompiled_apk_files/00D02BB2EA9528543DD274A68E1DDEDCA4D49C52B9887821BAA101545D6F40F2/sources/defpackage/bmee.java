package defpackage;

import android.app.Activity;
import android.text.BidiFormatter;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmee  reason: default package */
/* loaded from: classes3.dex */
public final class bmee {
    public final Activity a;
    public final ilo b;
    public final begh c;
    public final dbty<String> d = dbud.a(new dbty(this) { // from class: bmec
        private final bmee a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            ilo iloVar = this.a.b;
            if (iloVar.w()) {
                return iloVar.q();
            }
            return iloVar.bi() ? iloVar.bh() : "";
        }
    });
    public final dbty<String> e = dbud.a(new dbty(this) { // from class: bmed
        private final bmee a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            String string;
            bmee bmeeVar = this.a;
            ilo iloVar = bmeeVar.b;
            Activity activity = bmeeVar.a;
            dnwf bX = iloVar.bX();
            if (bX == null) {
                return "";
            }
            int size = bX.l.size();
            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
            if (size == 0) {
                return "";
            }
            if (size != 1) {
                if (size == 2) {
                    return activity.getString(R.string.TITLE_FOR_TWO_CONTACTS, bidiFormatter.unicodeWrap(bX.l.get(0).a), bidiFormatter.unicodeWrap(bX.l.get(1).a));
                }
                return activity.getString(R.string.TITLE_FOR_THREE_OR_MORE_CONTACTS, bidiFormatter.unicodeWrap(bX.l.get(0).a), Integer.valueOf(size - 1));
            }
            int a = dngw.a(bX.l.get(0).b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0) {
                string = activity.getString(R.string.ADDRESS_TYPE_OTHER);
            } else if (i == 1) {
                string = activity.getString(R.string.HOME_LOCATION);
            } else if (i != 2) {
                string = bX.l.get(0).c;
            } else {
                string = activity.getString(R.string.WORK_LOCATION);
            }
            return !dbsj.d(string) ? activity.getString(R.string.TITLE_FOR_ONE_CONTACT, bidiFormatter.unicodeWrap(bX.l.get(0).a), bidiFormatter.unicodeWrap(string)) : "";
        }
    });

    public bmee(Activity activity, ilo iloVar, begh beghVar) {
        this.a = activity;
        this.b = iloVar;
        this.c = beghVar;
    }

    private final boolean b() {
        return !dbsj.d(this.e.a());
    }

    public final String a(String str) {
        List<String> subList;
        dcdc<String> z = this.b.z();
        if (z.size() >= 2 || ((z.size() == 1 && this.b.bi()) || (b() && !z.isEmpty()))) {
            if (b()) {
                if (this.b.bg()) {
                    if (z.size() > 1) {
                        subList = z.subList(1, z.size());
                    } else {
                        subList = dcdc.e();
                    }
                } else {
                    subList = z.subList(0, z.size());
                }
            } else if (!this.b.bi() || this.b.bg()) {
                subList = z.subList(1, z.size());
            } else {
                subList = z.subList(0, z.size());
            }
            return dbrz.e(str).j().g(subList);
        }
        return "";
    }
}
