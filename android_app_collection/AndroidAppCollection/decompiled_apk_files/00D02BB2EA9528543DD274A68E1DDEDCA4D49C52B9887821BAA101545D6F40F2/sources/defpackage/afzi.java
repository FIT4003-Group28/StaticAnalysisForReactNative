package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afzi  reason: default package */
/* loaded from: classes2.dex */
public final class afzi implements agvz {
    final /* synthetic */ afzm a;

    public afzi(afzm afzmVar) {
        this.a = afzmVar;
    }

    @Override // defpackage.agvz
    public final void a(@dzsi final agwo agwoVar) {
        this.a.aq.execute(new Runnable(this, agwoVar) { // from class: afzh
            private final afzi a;
            private final agwo b;

            {
                this.a = this;
                this.b = agwoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afzi afziVar = this.a;
                agwo agwoVar2 = this.b;
                afzm afzmVar = afziVar.a;
                afzmVar.w(afzmVar.f.a().j(), agwoVar2);
            }
        });
    }
}
