package defpackage;
/* compiled from: PG */
/* renamed from: akaq  reason: default package */
/* loaded from: classes.dex */
public class akaq implements ajyk {
    private final aari a;
    protected final ajxu b;
    protected final acti c;
    private final yni d;
    private final ajyi e;
    private final yzj f;

    public akaq(aari aariVar, yni yniVar, ajyi ajyiVar, yzj yzjVar, acti actiVar, ajxu ajxuVar) {
        aariVar.getClass();
        this.a = aariVar;
        yniVar.getClass();
        this.d = yniVar;
        ajyiVar.getClass();
        this.e = ajyiVar;
        this.c = actiVar;
        yzjVar.getClass();
        this.f = yzjVar;
        this.b = ajxuVar;
    }

    @Override // defpackage.ajyk
    public ajyj a(Object obj, akam akamVar, akaf akafVar) {
        if (obj instanceof aakq) {
            ajyq ajyqVar = new ajyq(this.a, this.e, this.d, this.f, this.c, akamVar);
            if (akamVar == null) {
                ajyqVar.i((aakq) obj);
            }
            return ajyqVar;
        } else if (obj instanceof aslj) {
            return new ajys(this.a, this.e, this.d, this.f, this.c, (aslj) obj);
        } else {
            if (obj instanceof aald) {
                auuf auufVar = ((aald) obj).a;
                return new akap(this.e, this.d, auufVar, aolu.l(auufVar), null, null, akamVar);
            } else if (obj instanceof aakp) {
                auuf auufVar2 = ((aakp) obj).a;
                return new ajxx(this.e, this.d, auufVar2, aolu.k(auufVar2), this.b, akamVar);
            } else if (!(obj instanceof aueq)) {
                return null;
            } else {
                ajzg ajzgVar = new ajzg(this.a, this.e, this.d, this.f, this.c);
                ajzgVar.l((aueq) obj);
                return ajzgVar;
            }
        }
    }
}
