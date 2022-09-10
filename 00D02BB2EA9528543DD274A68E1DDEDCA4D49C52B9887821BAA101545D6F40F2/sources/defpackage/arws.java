package defpackage;

import com.spotify.protocol.types.ListItem;
import com.spotify.protocol.types.ListItems;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arws  reason: default package */
/* loaded from: classes2.dex */
public final class arws implements dxgk<ListItems> {
    final /* synthetic */ arwv a;

    public arws(arwv arwvVar) {
        this.a = arwvVar;
    }

    @Override // defpackage.dxgk
    public final /* bridge */ /* synthetic */ void a(ListItems listItems) {
        ListItem[] listItemArr;
        for (ListItem listItem : listItems.items) {
            if (listItem.id.equals("com.spotify.recently-played") && listItem.hasChildren) {
                arwv arwvVar = this.a;
                dxgl<ListItems> b = arwvVar.g.b(listItem, arwvVar.b);
                arwv arwvVar2 = this.a;
                b.c(arwvVar2.a(new arwt(arwvVar2, arwvVar2.d)));
                return;
            }
        }
    }
}
