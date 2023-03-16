<template>

</template>

<script>
    


    export default {
        name: '',
        components:{
        },
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
        
        }),
        async created() {
        },
        watch: {
            
        },

        methods: {
            edit() {
                this.editMode = true;
            },
            
        }
    }
</script>

