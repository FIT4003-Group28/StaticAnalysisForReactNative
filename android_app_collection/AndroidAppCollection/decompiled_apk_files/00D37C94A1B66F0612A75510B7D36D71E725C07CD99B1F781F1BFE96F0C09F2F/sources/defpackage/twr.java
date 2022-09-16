package defpackage;
/* compiled from: PG */
/* renamed from: twr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class twr implements anir {
    public final /* synthetic */ tqy a;
    private final /* synthetic */ int b;

    public /* synthetic */ twr(tqy tqyVar, int i) {
        this.b = i;
        this.a = tqyVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            tqy tqyVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                typ.d("%s: Unable to modify file subscription for key %s", "SharedFileManager", tqyVar);
                return anlz.q(false);
            }
            return anlz.q(true);
        } else if (i == 1) {
            tqy tqyVar2 = this.a;
            tqz tqzVar = (tqz) obj;
            if (tqzVar == null) {
                typ.d("%s: getSharedFile called on file that doesn't exists! Key = %s", "SharedFileManager", tqyVar2);
                return anlz.p(new tww());
            }
            return anlz.q(tqzVar);
        } else if (i == 2) {
            tqy tqyVar3 = this.a;
            if (!((Boolean) obj).booleanValue()) {
                typ.d("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", tqyVar3);
                return anlz.q(false);
            }
            return anlz.q(true);
        } else {
            tqy tqyVar4 = this.a;
            if (!((Boolean) obj).booleanValue()) {
                typ.d("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", tqyVar4);
                tpy a = tqa.a();
                a.a = tpz.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return anlz.p(a.a());
            }
            return anlz.q(null);
        }
    }
}
