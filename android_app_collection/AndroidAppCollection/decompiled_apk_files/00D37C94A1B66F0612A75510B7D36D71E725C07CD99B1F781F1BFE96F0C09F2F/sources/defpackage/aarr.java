package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aarr  reason: default package */
/* loaded from: classes.dex */
public abstract class aarr extends aarq {
    private final Set a;

    public aarr(aaqj aaqjVar, yqw yqwVar, aoqu aoquVar, aaoq aaoqVar, yjc yjcVar, yjb yjbVar) {
        this(aaqjVar, yqwVar, aoquVar, amvn.r(aaoqVar), yjcVar, yjbVar);
    }

    @Override // defpackage.aarq
    public final void l(aoqu aoquVar) {
        for (aaoq aaoqVar : this.a) {
            aaoqVar.a(aoquVar);
        }
    }

    public aarr(aaqj aaqjVar, yqw yqwVar, aoqu aoquVar, Set set, yjc yjcVar, yjb yjbVar) {
        super(aaqjVar, yqwVar, aoquVar, yjcVar, yjbVar);
        set.getClass();
        this.a = set;
    }
}
