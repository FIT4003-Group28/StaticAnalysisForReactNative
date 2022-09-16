package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: lso  reason: default package */
/* loaded from: classes3.dex */
public final class lso extends akaq {
    private final aari a;
    private final yni d;
    private final ajyi e;
    private final lpj f;
    private final lpr g;
    private final RecyclerView h;
    private final kza i;

    public lso(aari aariVar, yni yniVar, ajyi ajyiVar, yzj yzjVar, acti actiVar, lpj lpjVar, lpr lprVar, kza kzaVar, RecyclerView recyclerView) {
        super(aariVar, yniVar, ajyiVar, yzjVar, actiVar, null);
        this.a = aariVar;
        this.d = yniVar;
        ajyiVar.getClass();
        this.e = ajyiVar;
        this.f = lpjVar;
        this.g = lprVar;
        this.h = recyclerView;
        this.i = kzaVar;
    }

    @Override // defpackage.akaq, defpackage.ajyk
    public final ajyj a(Object obj, akam akamVar, akaf akafVar) {
        if (obj instanceof awda) {
            kza kzaVar = this.i;
            awda awdaVar = (awda) obj;
            RecyclerView recyclerView = this.h;
            Context context = (Context) kzaVar.a.get();
            context.getClass();
            ajyi ajyiVar = (ajyi) kzaVar.b.get();
            ajyiVar.getClass();
            yni yniVar = (yni) kzaVar.c.get();
            yniVar.getClass();
            Handler handler = (Handler) kzaVar.d.get();
            handler.getClass();
            ajxt ajxtVar = (ajxt) kzaVar.e.get();
            ajxtVar.getClass();
            lbd lbdVar = (lbd) kzaVar.f.get();
            lbdVar.getClass();
            ((ajin) kzaVar.g.get()).getClass();
            awdaVar.getClass();
            return new kyz(context, ajyiVar, yniVar, handler, ajxtVar, lbdVar, awdaVar, recyclerView, akafVar);
        } else if (obj instanceof aqxh) {
            return new log(this.e, this.d, (aqxh) obj);
        } else {
            if (obj instanceof aakq) {
                lpi a = this.f.a(this.a, this.c, akamVar);
                if (akamVar == null) {
                    a.i((aakq) obj);
                }
                return a;
            } else if (obj instanceof aupp) {
                return new kyr((aupp) obj);
            } else {
                if (obj instanceof aald) {
                    auuf auufVar = ((aald) obj).a;
                    return this.g.a(auufVar, aolu.l(auufVar), akamVar, null);
                }
                return super.a(obj, akamVar, akafVar);
            }
        }
    }
}
