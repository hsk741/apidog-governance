module.exports = (targetVal, opts, context) => {

    if (typeof targetVal !== "string") {
        return;
    }

    if (targetVal !== targetVal.toLowerCase()) {
        return [
            {
                message: `Path '${targetVal}' must be lowercase.`,
                path: context.path
            }
        ];
    }

    return;
};
