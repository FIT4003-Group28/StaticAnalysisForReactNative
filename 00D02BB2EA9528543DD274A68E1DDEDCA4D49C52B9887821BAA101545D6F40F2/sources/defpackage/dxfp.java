package defpackage;

import com.spotify.protocol.types.ChildrenPageRequest;
import com.spotify.protocol.types.GetRecommendedContentItemsRequest;
import com.spotify.protocol.types.ListItem;
import com.spotify.protocol.types.ListItems;
/* compiled from: PG */
/* renamed from: dxfp  reason: default package */
/* loaded from: classes6.dex */
public final class dxfp {
    public final dxgx a;

    public dxfp(dxgx dxgxVar) {
        this.a = dxgxVar;
    }

    public final dxgl<ListItems> a(dxex dxexVar) {
        dxgd.a(dxexVar);
        return this.a.b("com.spotify.get_recommended_root_items", new GetRecommendedContentItemsRequest(dxexVar.g), ListItems.class);
    }

    public final dxgl<ListItems> b(ListItem listItem, int i) {
        dxgd.a(listItem);
        return this.a.b("com.spotify.get_children_of_item", new ChildrenPageRequest(listItem.id, i, 0), ListItems.class);
    }
}
