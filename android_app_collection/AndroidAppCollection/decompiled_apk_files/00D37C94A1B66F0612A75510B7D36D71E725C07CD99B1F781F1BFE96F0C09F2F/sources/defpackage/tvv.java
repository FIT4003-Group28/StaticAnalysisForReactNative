package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: tvv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvv implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ tvv u = new tvv(20);
    public static final /* synthetic */ tvv t = new tvv(19);
    public static final /* synthetic */ tvv s = new tvv(18);
    public static final /* synthetic */ tvv r = new tvv(17);
    public static final /* synthetic */ tvv q = new tvv(16);
    public static final /* synthetic */ tvv p = new tvv(15);
    public static final /* synthetic */ tvv o = new tvv(14);
    public static final /* synthetic */ tvv n = new tvv(13);
    public static final /* synthetic */ tvv m = new tvv(12);
    public static final /* synthetic */ tvv l = new tvv(11);
    public static final /* synthetic */ tvv k = new tvv(10);
    public static final /* synthetic */ tvv j = new tvv(9);
    public static final /* synthetic */ tvv i = new tvv(8);
    public static final /* synthetic */ tvv h = new tvv(7);
    public static final /* synthetic */ tvv g = new tvv(6);
    public static final /* synthetic */ tvv f = new tvv(5);
    public static final /* synthetic */ tvv e = new tvv(4);
    public static final /* synthetic */ tvv d = new tvv(3);
    public static final /* synthetic */ tvv c = new tvv(2);
    public static final /* synthetic */ tvv b = new tvv(1);
    public static final /* synthetic */ tvv a = new tvv();

    private /* synthetic */ tvv() {
    }

    private /* synthetic */ tvv(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((tqt) obj).d;
            case 1:
                Void r5 = (Void) obj;
                tvs.a = true;
                return null;
            case 2:
                aopa mo52toBuilder = ((tqt) obj).mo52toBuilder();
                mo52toBuilder.clear();
                return (tqt) mo52toBuilder.mo39build();
            case 3:
                aopa mo52toBuilder2 = ((tqt) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                ((tqt) mo52toBuilder2.instance).d = tqt.emptyProtobufList();
                return (tqt) mo52toBuilder2.mo39build();
            case 4:
                IOException iOException = (IOException) obj;
                return false;
            case 5:
                IOException iOException2 = (IOException) obj;
                return false;
            case 6:
                IOException iOException3 = (IOException) obj;
                return false;
            case 7:
                IOException iOException4 = (IOException) obj;
                return false;
            case 8:
                Void r52 = (Void) obj;
                return true;
            case 9:
                Void r53 = (Void) obj;
                return true;
            case 10:
                Void r54 = (Void) obj;
                return true;
            case 11:
                Void r55 = (Void) obj;
                return true;
            case 12:
                IOException iOException5 = (IOException) obj;
                return false;
            case 13:
                IOException iOException6 = (IOException) obj;
                return false;
            case 14:
                Void r56 = (Void) obj;
                return true;
            case 15:
                Void r57 = (Void) obj;
                return true;
            case 16:
                Void r58 = (Void) obj;
                return true;
            case 17:
                Void r59 = (Void) obj;
                return true;
            case 18:
                aopa mo52toBuilder3 = ((trb) obj).mo52toBuilder();
                mo52toBuilder3.clear();
                return (trb) mo52toBuilder3.mo39build();
            case 19:
                return ampq.j((InputStream) obj);
            default:
                Exception exc = (Exception) obj;
                return amon.a;
        }
    }
}
