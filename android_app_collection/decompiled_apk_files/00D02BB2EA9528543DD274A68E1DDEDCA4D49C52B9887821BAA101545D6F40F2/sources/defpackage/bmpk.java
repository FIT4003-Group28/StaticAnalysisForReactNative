package defpackage;
/* compiled from: PG */
/* renamed from: bmpk  reason: default package */
/* loaded from: classes3.dex */
public final class bmpk implements bmof<bmpj> {
    private final bmtv a;

    public bmpk(bmtv bmtvVar) {
        this.a = bmtvVar;
    }

    @Override // defpackage.bmof
    public final /* bridge */ /* synthetic */ void a(bmpj bmpjVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.bmof
    public final /* bridge */ /* synthetic */ cqkl b(bmpj bmpjVar) {
        ckgn ckgnVar;
        bmpj bmpjVar2 = bmpjVar;
        if (bmpjVar2 != bmpj.ARE_YOU_HERE_NOW_QUESTION_SPLIT || this.a.z().booleanValue()) {
            switch (bmpjVar2.ordinal()) {
                case 0:
                    ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION;
                    break;
                case 1:
                    ckgnVar = ckgn.YOU_ARE_HERE_NOW;
                    break;
                case 2:
                    ckgnVar = ckgn.LAST_VISITED_TITLE;
                    break;
                case 3:
                    ckgnVar = ckgn.CHECKIN_YES;
                    break;
                case 4:
                    ckgnVar = ckgn.CHECKIN_NO;
                    break;
                case 5:
                    ckgnVar = ckgn.COLLAPSE_TOGGLE_CHEVRON;
                    break;
                case 6:
                    ckgnVar = ckgn.SHOW_PLACE_TIMELINE;
                    break;
                case 7:
                    ckgnVar = ckgn.YOU_HAVE_VISITED_THIS_PLACE;
                    break;
                case 8:
                    ckgnVar = ckgn.YOU_HAVE_NOT_VISITED_THIS_PLACE;
                    break;
                case 9:
                    ckgnVar = ckgn.EDIT_MARK_AS_VISITED;
                    break;
                case 10:
                    ckgnVar = ckgn.EDIT_MARK_AS_NOT_BEEN_HERE;
                    break;
                case 11:
                    ckgnVar = ckgn.EDIT_REMOVE_ALL_VISITS;
                    break;
                case 12:
                    ckgnVar = ckgn.REMOVE_ALL_VISITS;
                    break;
                case 13:
                    ckgnVar = ckgn.a(this.a.T().intValue()).b();
                    break;
                case 14:
                    ckgnVar = ckgn.VIEW_IN_VISITED_PLACES;
                    break;
                case 15:
                    ckgnVar = ckgn.VISIBLE_ONLY_TO_YOU;
                    break;
                default:
                    String valueOf = String.valueOf(bmpjVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Unexpected UI component: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
            }
            this.a.b(ckgnVar);
        }
        return cqkl.a;
    }
}
