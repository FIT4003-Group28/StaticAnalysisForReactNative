package defpackage;

import android.service.notification.StatusBarNotification;
import android.text.Spanned;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: utr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class utr implements Comparator {
    private final /* synthetic */ int u;
    public static final /* synthetic */ utr t = new utr(20);
    public static final /* synthetic */ utr s = new utr(19);
    public static final /* synthetic */ utr r = new utr(18);
    public static final /* synthetic */ utr q = new utr(17);
    public static final /* synthetic */ utr p = new utr(16);
    public static final /* synthetic */ utr o = new utr(15);
    public static final /* synthetic */ utr n = new utr(14);
    public static final /* synthetic */ utr m = new utr(13);
    public static final /* synthetic */ utr l = new utr(12);
    public static final /* synthetic */ utr k = new utr(11);
    public static final /* synthetic */ utr j = new utr(10);
    public static final /* synthetic */ utr i = new utr(9);
    public static final /* synthetic */ utr h = new utr(8);
    public static final /* synthetic */ utr g = new utr(7);
    public static final /* synthetic */ utr f = new utr(5);
    public static final /* synthetic */ utr e = new utr(4);
    public static final /* synthetic */ utr d = new utr(3);
    public static final /* synthetic */ utr c = new utr(2);
    public static final /* synthetic */ utr b = new utr(1);
    public static final /* synthetic */ utr a = new utr();

    private /* synthetic */ utr() {
    }

    public /* synthetic */ utr(int i2) {
        this.u = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = 1;
        switch (this.u) {
            case 0:
                return (((utt) obj).a.e() > ((utt) obj2).a.e() ? 1 : (((utt) obj).a.e() == ((utt) obj2).a.e() ? 0 : -1));
            case 1:
                ucw ucwVar = (ucw) obj2;
                int a2 = aolu.a(((ucw) obj).d.l);
                if (a2 == 0) {
                    a2 = 1;
                }
                int g2 = uhj.g(a2);
                int a3 = aolu.a(ucwVar.d.l);
                if (a3 != 0) {
                    i2 = a3;
                }
                return g2 - uhj.g(i2);
            case 2:
                int i3 = wjk.al;
                return ((Spanned) obj).toString().compareTo(((Spanned) obj2).toString());
            case 3:
                return ((apae) obj).d - ((apae) obj2).d;
            case 4:
                yxn yxnVar = (yxn) obj;
                yxn yxnVar2 = (yxn) obj2;
                throw null;
            case 5:
                amuk amukVar = zne.c;
                return -Long.valueOf(((DeviceLocalFile) obj).d()).compareTo(Long.valueOf(((DeviceLocalFile) obj2).d()));
            case 6:
                return ((String) ((zvu) obj).e.c()).compareTo((String) ((zvu) obj2).e.c());
            case 7:
                int i4 = ((aacm) obj).f;
                int i5 = ((aacm) obj2).f;
                if (i4 == i5) {
                    return 0;
                }
                return i4 >= i5 ? 1 : -1;
            case 8:
                Map.Entry entry = (Map.Entry) obj2;
                long j2 = adao.a;
                awtq awtqVar = ((awtp) ((Map.Entry) obj).getValue()).d;
                if (awtqVar == null) {
                    awtqVar = awtq.a;
                }
                long j3 = awtqVar.h;
                awtq awtqVar2 = ((awtp) entry.getValue()).d;
                if (awtqVar2 == null) {
                    awtqVar2 = awtq.a;
                }
                return j3 < awtqVar2.h ? 1 : -1;
            case 9:
                long j4 = adao.a;
                return ((awtt) ((Map.Entry) obj).getValue()).e < ((awtt) ((Map.Entry) obj2).getValue()).e ? 1 : -1;
            case 10:
                return ((bhc) obj).d.compareTo(((bhc) obj2).d);
            case 11:
                int i6 = afnw.a;
                return ((awsp) obj2).c - ((awsp) obj).c;
            case 12:
                int i7 = agbz.c;
                return ((agbx) obj).c - ((agbx) obj2).c;
            case 13:
                return (int) (((StatusBarNotification) obj).getPostTime() - ((StatusBarNotification) obj2).getPostTime());
            case 14:
                return ((agfo) obj).b.compareTo(((agfo) obj2).b);
            case 15:
                return ((Long) ((Map.Entry) obj2).getValue()).compareTo((Long) ((Map.Entry) obj).getValue());
            case 16:
                return ((avhm) obj).d - ((avhm) obj2).d;
            case 17:
                return ahdp.a.compare(((agqb) obj).a, ((agqb) obj2).a);
            case 18:
                return ahdp.b.compare(((agqb) obj).a, ((agqb) obj2).a);
            case 19:
                aqnl aqnlVar = (aqnl) obj2;
                Comparator comparator = ahdp.a;
                attl b2 = attl.b(((aqnl) obj).d);
                if (b2 == null) {
                    b2 = attl.UNKNOWN_FORMAT_TYPE;
                }
                attl b3 = attl.b(aqnlVar.d);
                if (b3 == null) {
                    b3 = attl.UNKNOWN_FORMAT_TYPE;
                }
                return comparator.compare(b2, b3);
            default:
                aqnl aqnlVar2 = (aqnl) obj2;
                Comparator comparator2 = ahdp.b;
                attl b4 = attl.b(((aqnl) obj).d);
                if (b4 == null) {
                    b4 = attl.UNKNOWN_FORMAT_TYPE;
                }
                attl b5 = attl.b(aqnlVar2.d);
                if (b5 == null) {
                    b5 = attl.UNKNOWN_FORMAT_TYPE;
                }
                return comparator2.compare(b4, b5);
        }
    }
}
