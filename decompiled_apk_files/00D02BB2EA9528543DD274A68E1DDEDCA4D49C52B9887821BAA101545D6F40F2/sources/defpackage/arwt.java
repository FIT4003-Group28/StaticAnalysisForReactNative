package defpackage;

import com.spotify.protocol.types.ListItem;
import com.spotify.protocol.types.ListItems;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arwt  reason: default package */
/* loaded from: classes2.dex */
public final class arwt implements dxgk<ListItems> {
    final /* synthetic */ arwv a;
    private final List<ListItem> b;

    public arwt(arwv arwvVar, List<ListItem> list) {
        this.a = arwvVar;
        this.b = list;
    }

    @Override // defpackage.dxgk
    public final /* bridge */ /* synthetic */ void a(ListItems listItems) {
        ListItem[] listItemArr;
        for (ListItem listItem : listItems.items) {
            if (listItem.playable) {
                this.b.add(listItem);
            } else if (listItem.hasChildren) {
                arwv arwvVar = this.a;
                arwvVar.g.b(listItem, arwvVar.b).c(this.a.a(this));
            }
        }
        arwv arwvVar2 = this.a;
        if (arwvVar2.c == 0) {
            ArrayList arrayList = new ArrayList(arwvVar2.d.size());
            for (ListItem listItem2 : arwvVar2.d) {
                arrayList.add(listItem2.id);
            }
            ArrayList arrayList2 = new ArrayList();
            for (ListItem listItem3 : arwvVar2.e) {
                if (!arrayList.contains(listItem3.id)) {
                    arrayList2.add(listItem3);
                }
            }
            int min = Math.min(arwvVar2.d.size(), Math.max(Math.min(6, arwvVar2.b), arwvVar2.b - arrayList2.size()));
            int min2 = Math.min(arrayList2.size(), arwvVar2.b - min);
            arwvVar2.f.addAll(arwvVar2.d.subList(0, min));
            arwvVar2.f.addAll(arrayList2.subList(0, min2));
            arwvVar2.a.a(dcdc.r(arwvVar2.f));
        }
    }
}
