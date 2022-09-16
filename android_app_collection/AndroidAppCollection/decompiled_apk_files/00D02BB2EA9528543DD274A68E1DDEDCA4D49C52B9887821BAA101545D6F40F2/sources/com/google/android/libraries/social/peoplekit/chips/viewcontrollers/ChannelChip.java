package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ChannelChip extends Chip {
    public ChipInfo a;
    public boolean b;

    public ChannelChip(Context context) {
        super(context);
        this.a = new ChipInfo();
    }

    public final Channel a() {
        return this.a.a;
    }

    public final CoalescedChannels b() {
        return this.a.b;
    }

    public void setChipSelected(boolean z) {
        this.b = z;
    }

    public void setContactMethods(CoalescedChannels coalescedChannels) {
        this.a.b = coalescedChannels;
    }

    public void setSelectedChannel(Channel channel) {
        this.a.a = channel;
    }

    public ChannelChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ChipInfo();
    }

    public ChannelChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ChipInfo();
    }
}
