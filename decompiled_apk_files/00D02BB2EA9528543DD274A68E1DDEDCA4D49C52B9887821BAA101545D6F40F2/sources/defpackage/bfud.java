package defpackage;
/* compiled from: PG */
/* renamed from: bfud  reason: default package */
/* loaded from: classes3.dex */
public class bfud implements bfua {
    private final String a;
    private final Integer b;
    private final Boolean c;

    public bfud(dqws dqwsVar) {
        int i;
        this.a = dqwsVar.b;
        Boolean valueOf = Boolean.valueOf(dqwsVar.c);
        this.c = valueOf;
        int a = dqwr.a(dqwsVar.d);
        a = a == 0 ? 1 : a;
        if (valueOf.booleanValue()) {
            switch (a - 1) {
                case 1:
                    i = 2131232282;
                    break;
                case 2:
                    i = 2131232127;
                    break;
                case 3:
                    i = 2131232144;
                    break;
                case 4:
                    i = 2131232145;
                    break;
                case 5:
                    i = 2131232319;
                    break;
                case 6:
                    i = 2131232177;
                    break;
                case 7:
                    i = 2131232189;
                    break;
                case 8:
                    i = 2131232203;
                    break;
                case 9:
                    i = 2131232279;
                    break;
                case 10:
                    i = 2131232280;
                    break;
                case 11:
                    i = 2131232128;
                    break;
                case 12:
                    i = 2131232294;
                    break;
                case 13:
                    i = 2131232310;
                    break;
                case 14:
                    i = 2131232327;
                    break;
                case 15:
                    i = 2131232331;
                    break;
                case 16:
                    i = 2131232386;
                    break;
                case 17:
                    i = 2131232404;
                    break;
                case 18:
                    i = 2131232407;
                    break;
                case 19:
                    i = 2131232427;
                    break;
                case 20:
                    i = 2131232428;
                    break;
                case 21:
                    i = 2131232393;
                    break;
                case 22:
                    i = 2131232466;
                    break;
                default:
                    i = 2131232198;
                    break;
            }
        } else {
            i = 2131232239;
        }
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.bfua
    public String a() {
        return this.a;
    }

    @Override // defpackage.bfua
    public Integer b() {
        return this.b;
    }

    @Override // defpackage.bfua
    public Boolean c() {
        return this.c;
    }

    @Override // defpackage.bfua
    @dzsi
    public CharSequence d() {
        if (this.c.booleanValue()) {
            return this.a;
        }
        return null;
    }
}
